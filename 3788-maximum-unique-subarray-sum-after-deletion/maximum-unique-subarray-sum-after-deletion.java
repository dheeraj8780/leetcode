class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> res=new HashSet<>();
        int mx=nums[0];
        for(int i:nums){
            res.add(i);
            mx=Math.max(i,mx);
        }
        if(mx<=0){
            return mx;
        }
        int s=0,max=Integer.MIN_VALUE;
        for(int i:res){
            if(i<0){
                continue;
            }
            s+=i;
            max=Math.max(s,max);
        }
        return max;
    }
}