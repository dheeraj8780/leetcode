class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int id=0;
        while(id<a.length() && id<b.length()){
            if(a.charAt(id)==b.charAt(id)){
                id++;
            }else{
                break;
            }
        }
        return a.substring(0,id);
    }
}