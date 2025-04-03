class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder s=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int c=0;
        while(i>=0 || j>=0 || c==1){
            if(i>=0){
                c+=s1.charAt(i--)-'0';
            }
            if(j>=0){
                c+=s2.charAt(j--)-'0';
            }
            s.append(c%2);
            c=c/2;
        }
        s=s.reverse();
        return s.toString();
    }
}