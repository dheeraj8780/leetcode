class Solution {
    public int[] diStringMatch(String s) {
        int[] n=new int[s.length()+1];
        int l=0;
        int r=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                n[i]=l;
                l++;
            }else{
                n[i]=r;
                r--;
            }
        }
        n[s.length()]=l;
        return n;
    }
}