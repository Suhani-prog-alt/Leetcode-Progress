class Solution:
    def tribonacci(self, n: int) -> int:
        a = 0 
        b = 1
        c = 1
        d = a+b+c
        l = [0,1,1]
        if n==0:
            return 0
        elif n == 1 or n == 2:
            return 1
        for i in range(n-3):
           d = a+b+c
           l.append(d)
           a = b
           b = c
           c = d
        return l[-3]+l[-2]+l[-1]
        
