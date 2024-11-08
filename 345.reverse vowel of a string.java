class Solution {
    public String reverseVowels(String s) {
        char[] q = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        String v="aeiouAEIOU";
        while(l<r){
            while(l<r && !v.contains(Character.toString(q[l]))){
                l++;
            }
            while(l<r && !v.contains(Character.toString(q[r]))){
                r--;
            }
            char t=q[l];
            q[l]=q[r];
            q[r]=t;
            l++;r--;
        }
        return new String(q);
    }
}
