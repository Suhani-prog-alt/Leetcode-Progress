class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        s1 = sum(nums)
        for i in range(len(nums)):
            nums[i] = str(nums[i])
        s = ''.join(nums)
        s = list(s)

        for i in range(len(s)):
            s[i] = int(s[i])
        s2 = sum(s) 
        return abs(s2-s1)
        
