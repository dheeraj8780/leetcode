class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1,c=0;
        if(n<0) return -1;
        else if(n==0){ return a;}
        else if(n==1){ return b;}
        else{
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
        }
        return c;
    }
}