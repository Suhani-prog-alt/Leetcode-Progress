class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        s = 0
        for i in matrix:
            if target in i:
                s = 1
                break
            else:
                s = 0
        if s == 0:
            return False
        elif s== 1:
            return True
