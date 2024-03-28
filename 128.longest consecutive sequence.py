class Solution(object):
    def longestConsecutive(self, nums):
        n=set(nums)
        b=0
        for i in n:
            if i-1 not in n:
                s=i+1
                while s in n:
                    s+=1
                b=max(b,s-i)
        return b
        
