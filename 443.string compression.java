class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==curr){
                c++;
                i++;
            }
            chars[index++]=curr;
            if(c>1){
                for(char s:Integer.toString(c).toCharArray()){
                    chars[index++]=s;
                }
            }
        }
        return index;
    }
}