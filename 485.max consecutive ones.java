class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        int maxk=0;
        if(nums[0]==1){
                k++;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }
            if(nums[i]==0)
            {
                if(k>maxk){
                    maxk=k;
                }
                k=0;
            }
        }
        if(k>maxk){
            maxk=k;
        }
        return maxk;
    }
}