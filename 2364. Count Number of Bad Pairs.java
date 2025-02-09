class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        long totalpairs=n*(n-1)/2;
        long goodpairs=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = i-nums[i];
            int prevcount=map.getOrDefault(val,0);
            goodpairs+=prevcount;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return totalpairs-goodpairs;
    }
}