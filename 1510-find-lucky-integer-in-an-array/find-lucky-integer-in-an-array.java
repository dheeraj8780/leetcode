class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> res=new HashMap<>();
        int max=-1;
        for(int i:arr){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        for(int k:res.keySet()){
            if(res.get(k)==k){
                max=k;
            }
        }
        return max;
    }
}