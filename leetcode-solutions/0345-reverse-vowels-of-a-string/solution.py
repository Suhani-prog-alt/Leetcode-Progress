class Solution:
    def reverseVowels(self, s: str) -> str:
        l = []
        st = ''
        count = 0
        if s == '':
            return l
        for i in s:
            if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U':
                l.append(i)
                st = st + '+'
            else:
                st = st + i
            
        l.reverse()
        # print(l)
        j = 0
        # print(st)
        s_t = ''
        for i in st:
            if i == '+' and len(l) >0:
                s_t = s_t + l[j]
                j+=1
            else:
                s_t = s_t + i
        # print(s)
        
        return s_t


