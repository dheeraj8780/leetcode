class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> s= new HashMap<>();
        for(int i:nums){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i:s.values()){
            if(i%2 != 0){
                return false;
            }
        }
        return true;
    }
}