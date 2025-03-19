class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> s= new HashMap<>();
        for(int i:nums){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int a:s.values()){
            if(a>1){
                return true;
            }
        }
        return false;
    }
}