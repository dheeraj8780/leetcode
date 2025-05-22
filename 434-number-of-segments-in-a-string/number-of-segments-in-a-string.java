class Solution {
    public int countSegments(String s) {
        String []w=s.split(" ");
        int c=0;
        for(String i:w){
            if(!i.isEmpty()){
                c++;
            }
        }
        return c;
    }
}