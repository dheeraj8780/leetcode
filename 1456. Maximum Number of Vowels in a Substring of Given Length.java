class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> v=Set.of('a','e','i','o','u'); 
        int c=0;
        for(int i=0;i<k;i++){
            c+=v.contains(s.charAt(i))?1:0;
        }
        int ans=c;
        for(int i=k;i<s.length();i++){
            c+=v.contains(s.charAt(i))?1:0;
            c-=v.contains(s.charAt(i-k))?1:0;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}