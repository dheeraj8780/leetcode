class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder a= new StringBuilder();
        int i=word1.length();
        int j=word2.length();
        int maxlen=Math.max(i,j);
        for(int x=0;x<maxlen;x++){
            if(x<i){
                a.append(word1.charAt(x));
            }
            if(x<j){
                a.append(word2.charAt(x));
            }
        }
        return a.toString();
    }
}
