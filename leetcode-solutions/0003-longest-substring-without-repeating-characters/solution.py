class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        L = []
        for i in range(len(s)):
            l = []
            for j in range(i,len(s)):
                if s[j] in l:
                    st_r = ''.join(l)
                    L.append(st_r)
                    break
                else:
                    l.append(s[j])
                    L.append(s[j])
                    st_r = ''.join(l)
                    L.append(st_r)
        count = []
        for i in L:
            count.append(len(i))
        if s == " ":
            return 1
        elif len(L) == 0:
            return 0
        else:
            return max(count)
