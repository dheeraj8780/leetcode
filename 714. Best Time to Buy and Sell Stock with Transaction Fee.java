class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy=Integer.MIN_VALUE;
        int s=0;
        for(int p:prices){
            buy=Math.max(buy,s-p);
            s=Math.max(s,buy+p-fee);
        }
        return s;
    }
}