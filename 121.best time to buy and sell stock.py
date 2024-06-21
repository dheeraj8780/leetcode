class Solution(object):
    def maxProfit(self, prices):
        l,r=0,1
        p=0
        while r<len(prices):
            if prices[l]<prices[r]:
                pr=prices[r]-prices[l]
                p=max(pr,p)
            else:
                l=r
            r+=1
        return p

        
