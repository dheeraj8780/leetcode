class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder r=new StringBuilder();
        for(int i=0;i<words.length;i++){
            r.append(new StringBuilder(words[i]).reverse());
            if(i!=words.length-1){
                r.append(" "); 
            }
        }
        return r.toString();
    }
}
