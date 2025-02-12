class Solution {
    public int maxProduct(int[] nums) {
        int left=1,right=1,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(left==0){
                left=1;
            }
            else if(right==0){
                right=1;
            }
            left=left*nums[i];
            right=right*nums[nums.length-i-1];
            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}
