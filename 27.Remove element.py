class Solution(object):
    def removeElement(self, nums, val):
        s=0
        k=0
        while s<len(nums):
            if nums[s]!=val:
                nums[k]=nums[s]
                k+=1
            s+=1
        return k
        
