class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo, up = 0, len(nums) - 1

        while lo <= up:
            mid = (lo+up)//2

            if nums[mid] > target:
                up = mid - 1
            elif nums[mid] < target:
                lo = mid + 1
            else:
                return mid
        
        return -1
        