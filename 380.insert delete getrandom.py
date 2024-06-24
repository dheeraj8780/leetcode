class RandomizedSet:

    def __init__(self):
        self.d={}
        self.l=[]
    def insert(self, val: int) -> bool:
        res=val not in self.d
        if res:
            self.d[val]=len(self.l)
            self.l.append(val)
        return res
    def remove(self, val: int) -> bool:
        res=val in self.d
        if res:
            idx=self.d[val]
            lstval=self.l[-1]
            self.l[idx]=lstval
            self.l.pop()
            self.d[lstval]=idx
            del self.d[val]
        return res  
    def getRandom(self) -> int:
        return random.choice(self.l)
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
