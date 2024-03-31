class Solution(object):
    def minimumSeconds(self, nums):
        n=len(nums)
        s={}
        for j in range(2*n):
            i=j%n
            if nums[i] not in s:
                s[nums[i]]=[0,j]
            else:
                s[nums[i]]=[max(s[nums[i]][0],j-s[nums[i]][1]),j]
        ans=float("inf")
        for i in s.keys():
            ans=min(ans,int(s[i][0]/2))
        return ans

        
        
