class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        import numpy as np

        for i in nums2:
            nums1.append(i)
        nums1.sort()

        l = np.array(nums1)
        return (np.median(l))
