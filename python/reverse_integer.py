
# Algorithm: Reverse digits of an integer
# 1. Take absolute value of x
# 2. Reverse the digits
# 3. If reversed value is out of 32-bit range, return 0
# 4. Return reversed value with correct sign
class ReverseInteger:
    def reverse(self, x):
        rev = 0                   # Step 2: Initialize reversed number
        mod = abs(x)              # Step 1: Take absolute value
        while mod > 0:            # Step 2: Reverse digits
            rem = mod % 10
            rev = rev * 10 + rem
            mod = mod // 10
        if rev > 2**31 - 1 or rev < -2**31:  # Step 3: Check 32-bit range
            return 0
        return rev if x > 0 else -rev        # Step 4: Return with sign

if __name__ == "__main__":
    solver = ReverseInteger()

    # Test case 1
    num1 = 123
    result1 = solver.reverse(num1)
    print(f"Test case 1: {result1}")  # Expected: 321

    # Test case 2
    num2 = -123
    result2 = solver.reverse(num2)
    print(f"Test case 2: {result2}")  # Expected: -321

    # Test case 3
    num3 = 120
    result3 = solver.reverse(num3)
    print(f"Test case 3: {result3}")  # Expected: 21

    # Test case 4
    num4 = 0
    result4 = solver.reverse(num4)
    print(f"Test case 4: {result4}")  # Expected: 0
