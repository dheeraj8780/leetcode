class Solution(object):
    def isPalindrome(self, x):
        reverse=0
        temp=x
        while temp>0:
            rem=temp%10
            reverse=reverse*10+rem
            temp=temp/10
        if reverse==x:
            return True
        else:
            return False

        
