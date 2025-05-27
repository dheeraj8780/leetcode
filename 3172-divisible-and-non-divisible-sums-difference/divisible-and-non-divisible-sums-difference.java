class Solution {
    public int differenceOfSums(int n, int m) {
        int mdiv=0;
        int ndiv=0;
        for(int i=1;i<n+1;i++){
            if(i%m==0){
                mdiv+=i;
            }else{
                ndiv+=i;
            }
        }
        return ndiv-mdiv;
    }
}