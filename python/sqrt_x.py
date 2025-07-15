
# Algorithm: Find integer square root using binary search
# 1. Set start to 1, end to x
# 2. While start <= end:
#    a. Calculate mid
#    b. If mid*mid == x, return mid
#    c. If mid*mid > x, move end
#    d. Else, move start and update ans
# 3. Return ans
class SqrtX:
    def my_sqrt(self, x):
        start = 1                 # Step 1: Initialize start
        end = x                   # Step 1: Initialize end
        ans = 0                   # Step 1: Initialize answer
        while start <= end:       # Step 2: Binary search loop
            mid = start + (end - start) // 2  # Step 2a: Calculate mid
            if mid * mid == x:    # Step 2b: Check for exact square
                ans = mid
                break
            elif mid * mid > x:   # Step 2c: Move end
                end = mid - 1
            else:                 # Step 2d: Move start and update ans
                start = mid + 1
                ans = mid
        return ans                # Step 3: Return answer

if __name__ == "__main__":
    solver = SqrtX()

    # Test case 1
    x1 = 4
    result1 = solver.my_sqrt(x1)
    print(f"Test case 1: {result1}")  # Expected: 2

    # Test case 2
    x2 = 8
    result2 = solver.my_sqrt(x2)
    print(f"Test case 2: {result2}")  # Expected: 2

    # Test case 3
    x3 = 0
    result3 = solver.my_sqrt(x3)
    print(f"Test case 3: {result3}")  # Expected: 0
