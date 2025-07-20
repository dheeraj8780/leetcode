class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int v=0,c=0;
        for(char q:word.toCharArray()){
            if(Character.isLetter(q)){
                if("aeiouAEIOU".indexOf(q) != -1){
                    v++;
                }else{
                    c++;
                }
            }else if(!Character.isDigit(q)){
                return false;
            }
        }
        return v>=1 && c>=1;
    }
}