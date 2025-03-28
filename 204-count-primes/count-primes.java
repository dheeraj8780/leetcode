class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean res[]=new boolean[n];
        Arrays.fill(res,true);
        int c=0;
        res[0]=res[1]=false;
        for(int i=2;i<n;i++){
            if(res[i]){
                c++;
                for(long j=(long) i*i;j<n;j+=i){
                    res[(int) j]=false;
                }
            }
        }
        return c;
    }
}