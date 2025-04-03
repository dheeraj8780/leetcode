class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String l="";
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                String sub=s.substring(i,j+1);
                if(ispal(sub) && sub.length() > l.length()){
                    l=sub;
                }
            }
        }
        return l;
        
    }
    static boolean ispal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}