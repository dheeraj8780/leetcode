class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]%2==0){
                if(nums[j]%2==1){
                    i++;j++;
                }
                else{
                    return false;
                }
            }else{
                if(nums[j]%2==0){
                    i++;j++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}