class Solution(object):
    def kthSmallest(self, matrix, k):
        s=[]
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                s.append(matrix[i][j])
        s.sort()
        return s[k-1]
