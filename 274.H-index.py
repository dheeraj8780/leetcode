class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort(reverse=True)
        for i,ci in enumerate(citations):
            if i>=ci:
                return i
        return len(citations)
        
