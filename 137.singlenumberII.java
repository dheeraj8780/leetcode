class Solution {
    int n;
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=0;
            n=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[j]==n){
                    a++;
                }
            }
            if(a==0)break;
        }
        return n;
    }
}
