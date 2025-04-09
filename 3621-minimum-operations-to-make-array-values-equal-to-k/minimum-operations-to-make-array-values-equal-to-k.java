class Solution {
    public int minOperations(int[] nums, int k) {
        if(nums.length<1){
            return -1;
        }
        Map<Integer, Integer> m=new HashMap<>();
        for(int i:nums){
            if(i<k) return -1;
            else if(i>k) m.put(i,m.getOrDefault(i,0)+1);
        }
        return m.size();
    }
}