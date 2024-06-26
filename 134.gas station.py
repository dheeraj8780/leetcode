class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        if sum(gas)<sum(cost):
            return -1
        t=0
        r=0
        s=0
        while s<len(gas):
            t+=gas[s]-cost[s]
            if t<0:
                t=0
                r=s+1
            s+=1
        return r   
