class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxlen=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }maxlen=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxlen=Math.max(maxlen,sum);
        }
        return (double)maxlen/k;
    }
}