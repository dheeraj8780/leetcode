class Solution(object):
    def findDuplicates(self, nums):
        s=list()
        c=set()
        for num in nums:
            if num in c:
                s.append(num)
            c.add(num)
        return s
