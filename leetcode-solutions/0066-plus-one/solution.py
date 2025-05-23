class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for i in range(len(digits)):
            digits[i] =  str(digits[i])

        s = ''.join(digits)
        # print(s)
        s = int(s)
        s = s+1
        s = str(s)
        # print(s)
        l = []
        for i in s:
            l.append(int(i))
        return l

