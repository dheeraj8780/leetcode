class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> res=new HashSet<>();
        int maxsum=0,l=0,csum=0;
        for(int r=0;r<nums.length;r++){
            while(res.contains(nums[r])){
                res.remove(nums[l]);
                csum-=nums[l];
                l++;
            }
            res.add(nums[r]);
            csum+=nums[r];
            maxsum=Math.max(csum,maxsum);
        }
        return maxsum;
    }
}