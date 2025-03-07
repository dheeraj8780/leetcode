class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean s[]=new boolean[right+1];
        Arrays.fill(s,true);
        s[0]=s[1]=false;
        for(int i=2;i*i<=right;i++){
            if(s[i]){
                for(int j=i*i;j<=right;j+=i){
                    s[j]=false;
                }
            }
        }
        List<Integer> p= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(s[i]){
                p.add(i);
            }
        }
        int mingap=Integer.MAX_VALUE;
        int res[]={-1,-1};
        if(p.size()<2){
            return res;
        }
        for(int i=1;i<p.size();i++){
            int gap=p.get(i)-p.get(i-1);
            if(gap<mingap){
                mingap=gap;
                res[0]=p.get(i-1);
                res[1]=p.get(i);
            }
        }
        return res;
    }
}