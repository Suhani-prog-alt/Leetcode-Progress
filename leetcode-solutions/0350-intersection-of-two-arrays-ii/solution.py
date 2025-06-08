class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        L = []
        # for i in range(len(nums1)):
        #     for j in range(len(nums2)):
        #         if nums1[i] in nums2:
        #             L.append(nums1[i])
        #             nums2.remove(nums1[i])
        #             break
        # return L

        if len(nums1) < len(nums2):
            l = len(nums1)
            n = nums1
            z = nums2
        else:
            l = len(nums2)
            n = nums2
            z = nums1

        for i in range(l):
            if n[i] in z:
                L.append(n[i])
                z.remove(n[i])

        return L 
