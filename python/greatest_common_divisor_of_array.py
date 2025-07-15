
# Algorithm: Find GCD of smallest and largest number in array
# 1. Find min and max in array
# 2. Start from min, decrement until both min and max are divisible
# 3. Return result
class GreatestCommonDivisorOfArray:
    def find_gcd(self, nums):
        max_ = 0                  # Step 1: Initialize max
        min_ = 100000             # Step 1: Initialize min
        for num in nums:          # Step 1: Find min and max
            min_ = min(num, min_)
            max_ = max(num, max_)
        result = min_             # Step 2: Start from min
        while result > 0:         # Step 2: Decrement until divisible
            if min_ % result == 0 and max_ % result == 0:
                break
            result -= 1
        return result              # Step 3: Return result

if __name__ == "__main__":
    solver = GreatestCommonDivisorOfArray()

    # Test case 1
    nums1 = [2, 4, 6, 8, 10]
    result1 = solver.find_gcd(nums1)
    print(f"Test case 1: {result1}")  # Expected: 2

    # Test case 2
    nums2 = [3, 9, 27]
    result2 = solver.find_gcd(nums2)
    print(f"Test case 2: {result2}")  # Expected: 9

    # Test case 3
    nums3 = [5, 10, 15, 20]
    result3 = solver.find_gcd(nums3)
    print(f"Test case 3: {result3}")  # Expected: 5
