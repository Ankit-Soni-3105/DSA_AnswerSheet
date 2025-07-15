
# Algorithm: Check if a number is a palindrome
# 1. Store the original number in temp
# 2. Reverse the number
# 3. Compare reversed number with original
class PalindromeNumber:
    def is_palindrome(self, x):
        temp = x                  # Step 1: Store original number
        rev = 0                   # Step 2: Initialize reversed number
        while x > 0:              # Step 2: Reverse the number
            rem = x % 10
            rev = rev * 10 + rem
            x = x // 10
        return rev == temp        # Step 3: Compare reversed and original

if __name__ == "__main__":
    solver = PalindromeNumber()

    # Test case 1
    num1 = 121
    result1 = solver.is_palindrome(num1)
    print(f"Test case 1: {result1}")  # Expected: True

    # Test case 2
    num2 = -121
    result2 = solver.is_palindrome(num2)
    print(f"Test case 2: {result2}")  # Expected: False

    # Test case 3
    num3 = 10
    result3 = solver.is_palindrome(num3)
    print(f"Test case 3: {result3}")  # Expected: False

    # Test case 4
    num4 = 0
    result4 = solver.is_palindrome(num4)
    print(f"Test case 4: {result4}")  # Expected: True
