class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        if len(s) <= k:
            return s[::-1]
        elif k ==1:
            return s
        else:
            l = []
            for i in range(0,len(s),2*k):
                l.append(s[i:i+k])
            
            print(l)
            S = ''
            j = 0
            for i in range(k,len(s)+k,2*k):
                S = S + l[j][::-1]
                S = S + s[i:i+k]
                j+=1
            return S

