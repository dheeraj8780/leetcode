class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        prof=0
        s=1
        while s<len(prices):
            if prices[s]>prices[s-1]:
                prof+=(prices[s]-prices[s-1])
            s+=1
        return prof

        
