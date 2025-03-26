class Solution {
    public int maxSubarraySumCircular(int[] nums){
        int n=nums.length;
        int maxka=kadne(nums);
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=nums[i];
            nums[i]= -nums[i];
        }
        int minka=kadne(nums);
        int cir=tot+minka;
        return (cir==0)?maxka:Math.max(maxka,cir);
    }
    public int kadne(int nums[]){
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}