class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long p=n;
        if(n<0){
            x=1/x;
            p=-p;
        }
        double res=1;
        while(p>0){
            if(p%2==1) res*=x;
            x*=x;
            p/=2;
        }
        return res;
    }
}