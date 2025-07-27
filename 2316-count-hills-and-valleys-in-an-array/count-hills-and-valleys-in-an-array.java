class Solution {
    public int countHillValley(int[] nums) {
        int l=0,c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                if((nums[i]<nums[l] && nums[i]<nums[i+1]) ||
                 (nums[i]>nums[i+1] && nums[i]>nums[l])){
                    c++;
                 }
                 l=i;
            }
        }
        return c;
    }
}