class Solution {
    public String shortestPalindrome(String s) {
        String re= new StringBuilder(s).reverse().toString();
        String c=s+"#"+re;
        int []lps= computelps(c);
        int toadd= s.length()-lps[c.length()-1];
        String add=new StringBuilder(s.substring(s.length()-toadd)).reverse().toString();
        return add+s;
    }
    public static int[] computelps(String s){
        int n=s.length();
        int[] lps=new int[n];
        int len=0;
        for(int i=1;i<n;){
            if(s.charAt(i)==s.charAt(len)){
                lps[i++]= ++len;
            }else if(len>0){
                len=lps[len-1];
            }else{
                lps[i++]=0;
            }
        }
        return lps;
    }
}