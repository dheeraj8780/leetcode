class Solution(object):
    def maxSubArray(self, nums):
        n=nums[0]
        c=0
        for i in nums:
            if c<0:
                c=0
            c+=i
            n=max(n,c)
        return n
