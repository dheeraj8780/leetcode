class Solution {
    public int maxProfit(int[] prices) {
        int initial=0;
        int fstbuy=Integer.MIN_VALUE;
        int fstsell=0;
        int secbuy=Integer.MIN_VALUE;
        int secsell=0;
        for(int p:prices){
            fstbuy=Math.max(initial-p,fstbuy);
            fstsell=Math.max(fstbuy+p,fstsell);
            secbuy=Math.max(fstsell-p,secbuy);
            secsell=Math.max(secbuy+p,secsell);
        }
        return secsell;
        
    }
}