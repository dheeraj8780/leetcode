class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer,Integer> s= new HashMap<>();
        for(int i:nums){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> en:s.entrySet()){
            if(en.getValue()==1){
                return en.getKey();
            }
        }
        return -1;
    }
}