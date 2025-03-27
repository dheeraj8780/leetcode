class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> var=new HashMap<>();
        char a[]=s.toCharArray();
        for(char c:a){
            var.put(c,var.getOrDefault(c,0)+1);
        }
        for(int i=0;i<a.length;i++){
            if(var.get(a[i])==1){
                return i;
            }
        }
        return -1;
    }
}