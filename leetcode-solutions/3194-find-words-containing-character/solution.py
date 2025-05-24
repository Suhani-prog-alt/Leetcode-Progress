class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        L = []
        ind = 0
        for i in words:
            if x in i:
                L.append(words.index(i,ind))
                ind+=1
        return L
