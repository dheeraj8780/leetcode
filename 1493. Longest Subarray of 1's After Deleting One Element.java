class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int z=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                z++;
            }
            while(z>1){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1-z);
        }
        return (ans==n)?ans-1:ans;
    }
}