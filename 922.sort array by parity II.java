class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=0;
        int r=1;
        while(l<nums.length && r<nums.length){
            while(l<nums.length && nums[l]%2==0){
                l+=2;
            }
            while(r<nums.length && nums[r]%2==1){
                r+=2;
            }
            if(l<nums.length && r<nums.length){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
            }
            l+=2;r+=2;
        }
        return nums;
    }
}
