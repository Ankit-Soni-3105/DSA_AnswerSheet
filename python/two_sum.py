
# Algorithm: Find indices of two numbers that add up to target
# 1. Iterate through each element
# 2. For each element, check all following elements
# 3. If their sum equals target, store indices
# 4. Return indices
class TwoSum:
    def two_sum(self, nums, target):
        ans = [0, 0]                  # Step 1: Initialize answer list
        for i in range(len(nums)):    # Step 1: Iterate through elements
            for j in range(i + 1, len(nums)):  # Step 2: Check following elements
                if nums[i] + nums[j] == target:  # Step 3: Check sum
                    ans[0] = i
                    ans[1] = j
        return ans                     # Step 4: Return indices

if __name__ == "__main__":
    solver = TwoSum()

    # Test case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    result1 = solver.two_sum(nums1, target1)
    print(f"Test case 1: [{result1[0]}, {result1[1]}]")  # Expected: [0, 1]

    # Test case 2
    nums2 = [3, 2, 4]
    target2 = 6
    result2 = solver.two_sum(nums2, target2)
    print(f"Test case 2: [{result2[0]}, {result2[1]}]")  # Expected: [1, 2]
