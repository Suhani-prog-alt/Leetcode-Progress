class Solution:
    def findLucky(self, arr: List[int]) -> int:
        dic_t = {}
        for i in arr:
            dic_t[i] = arr.count(i)
        
        lis = []
        # count  = 0
        for i in dic_t:
            if i == dic_t[i]:
                # count= 1
                lis.append(i)
            # else:
            #     count = 0
        
        if len(lis) >0:
            return max(lis)
        else :
            return -1
            


