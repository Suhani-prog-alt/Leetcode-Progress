class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        for i in range(k):
            ind = nums.index(min(nums))
            nums[ind] = min(nums)*multiplier
            print(nums)
        return nums
