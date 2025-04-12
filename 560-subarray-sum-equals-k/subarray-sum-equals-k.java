class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0;
        int ans=0;
        Map<Integer,Integer> res=new HashMap<>();
        res.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(res.containsKey(s-k)){
                ans+=res.get(s-k);
            }
            res.put(s,res.getOrDefault(s,0)+1);
        }
        return ans;
    }
}