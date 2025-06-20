class Solution:
    def largestSumAfterKNegations(self, nums: List[int], k: int) -> int:
        # for i in range(k):
        #     ind_x = nums.index(min(nums))
        #     nums[ind_x] = -nums[ind_x]

        for i in range(k):
            nums.sort()
            nums[0] = -nums[0]
        return sum(nums)
