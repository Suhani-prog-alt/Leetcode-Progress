class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if (nums[i]+nums[j]) == target:
                    return [i,j]
                    break
            # print(i)
            # if ((nums[i]+nums[i+1])%3) == 0 and i<len(nums):
            #     # print(nums[i],nums[i+1])
            #     return [i,i+1]
            #     break
