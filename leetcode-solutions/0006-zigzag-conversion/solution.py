class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        elif (len(s) == numRows) or (len(s)<numRows):
            return s
        else:
            # n  = (numRows - 1) + (numRows-1)
            # l = []
            # for i in range(0,len(s),n):
            #     l.append(s[i:i+n])
            # print(l)
            # st_r = ''
            # k = 0
            # for i in l:
            #     st_r+=i[0]
            #     i = i[1:]
            #     l[k] = i
            #     k+=1
            # print(st_r)
            # print(l)
            # for i in range(numRows -1):
            #     k = 0
            #     for j in l:
            #         if len(j)>1:
            #             st_r += j[0]
            #             j = j[1:]
            #             l[k] = j
            #             st_r += j[-1]
            #             j = j[:-1]
            #             l[k] = j
            #             k+=1
            #         elif len(j) == 1:
            #             st_r += j[0]
            #             j = j[1:]
            #             l[k] = j
            #             k+=1
            #         elif len(j) == 0:
            #             pass
            # print(st_r)
            # return st_r
            n = numRows - 2
            l1 = []
            for i in range(0,len(s),n+numRows):
                l1.append(s[i:i+numRows])

            for i in range(len(l1)):
                if len(l1[i]) != numRows:
                    for j in range(abs(numRows - len(l1[i]))):
                        l1[i] = l1[i] + ' '

            l = len(l1)
            l2 = []
            for i in range(numRows,len(s),n+numRows):
                l2.append(s[i:i+n])

            if len(l1)> len(l2):
                for i in range(abs(len(l1)-len(l2))):
                    l2.append(' ')

            for i in range(len(l2)):
                l2[i] = ' ' + l2[i] + ' '
                if len(l2[i]) != numRows:
                    for j in range(abs(len(l2[i]) - numRows)):
                        l2[i] = l2[i] + ' '
            
            for i in range(len(l2)):
                l2[i] = l2[i][::-1]
            
            s = ''
            # print(l1)
            # print(l2)
            if len(l1) >= len(l2):
                ln = len(l1)
            else:
                ln = len(l2)
            
            for i in range(numRows):
                for j in range(ln):
                    s = s + l1[j][i] + l2[j][i]
            
            S = ''
            for i in s:
                if i == ' ':
                    pass
                else:
                    S += i
            print(S)
            return S




