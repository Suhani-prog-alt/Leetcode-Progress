class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l = []
        a = list(zip(word1,word2))
        l1 = len(word1)
        l2 = len(word2)
        if l1>=l2:
            l = l2
            w = word1
        else:
            l = l1
            w = word2
        lst = []
        for i,j in a:
            lst.append(i)
            lst.append(j)
        # lst.extend((w[l:]))
        for i in w[l:]:
            lst.append(i)
        s = ''.join(lst)
        return s
