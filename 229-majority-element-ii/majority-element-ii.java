class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length==1){
            return List.of(nums[0]);
        }else if(nums.length==2){
            return nums[0]==nums[1]?List.of(nums[0]):List.of(nums[0],nums[1]);
        }
        List<Integer> s=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=nums.length/3;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> q:map.entrySet()){
            if(q.getValue()>r){
                s.add(q.getKey());
            }
        }
        return s;
    }
}