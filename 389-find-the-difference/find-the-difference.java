class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> co=new HashMap<>();
        for(char c:t.toCharArray()){
            co.put(c,co.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            co.put(c,co.get(c)-1);
            if(co.get(c)==0){
                co.remove(c);
            }
        }
        return (char) co.keySet().toArray()[0];
    }
}