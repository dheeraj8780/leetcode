class Solution {
    public int missingNumber(int[] nums) {
       if(nums.length==1){
        if(nums[0]==0){
            return 1;
        }if(nums[0]==1){
            return 0;
        }
       }
       Arrays.sort(nums);
       int p=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==p){
            p++;
        }
       }
       return p;
    }
}