class Solution(object):
    def majorityElement(self, nums):
        a=dict()
        for i in nums:
            if i in a.keys():
                a[i]+=1
            else:
                a[i]=1
        m=max(a,key=a.get)
        return m
        
        
