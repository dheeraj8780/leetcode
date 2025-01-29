class Solution {
    public String reverseWords(String s) {
        String q[]=s.split("\\s+");
        StringBuilder w=new StringBuilder();
        for(int i=q.length-1;i>=0;i--){
            w.append(q[i]);
            if(i!=0){
                w.append(" ");
            }
        }
        return w.toString().trim();
    }
}