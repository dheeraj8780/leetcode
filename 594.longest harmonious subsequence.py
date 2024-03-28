from collections import Counter
class Solution(object):
    def findLHS(self, nums):
        s=Counter(nums)
        s=dict(s)
        length=0
        for num in s:
            if num+1 in s:
                length=max(length,s[num]+s[num+1])
        return length
