class Solution {
    public boolean checkValidString(String s) {
        int l=0;
        int h=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                ++l;
                ++h;
            }else if(a==')'){
                --l;
                --h;
            }else{
                --l;++h;
            }
            if(l<0) l=0;
            if(h<0) return false;
        }
        
        return l==0;
    }
}