def__init__(self,head : Optional[Listnode]):
self.stack=head
self.counter=0
while self.curpointer:
	self.counter+=1
	self.curpointer=self.curpointer.next
def getrandom(self)-> int:
n=random.uniform(0,self.counter)
self.curpointer=self.stack
while n>1:
	self.curpointer=self.curpointer.next
	n-=1
return self.curpointer.val
