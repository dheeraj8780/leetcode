from collections import Counter
class Solution(object):
    def minDominoRotations(self, tops, bottoms):
        if len(tops)!=len(bottoms):
            return -1
        s,ca,cb=Counter(),Counter(tops),Counter(bottoms)
        for a,b in zip(tops,bottoms):
            if a==b:
                s[a]+=1
        for i in range(1,7):
            if ca[i]+cb[i]-s[i]==len(tops):
                return min(ca[i],cb[i])-s[i]
        return -1
        
