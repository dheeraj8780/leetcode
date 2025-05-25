class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> res=new HashSet<>();
        for(int i:arr){
            if(res.contains(i*2) || (res.contains(i/2) && i%2==0)){
                return true;
            }
            res.add(i);
        }
        return false;
    }
}