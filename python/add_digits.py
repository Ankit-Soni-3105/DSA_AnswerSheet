
# Algorithm: Add digits of a number until a single digit remains
# 1. Initialize sum_ to 0
# 2. While num > 0 or sum_ > 9, repeat:
#    a. If num is 0, set num to sum_ and reset sum_ to 0
#    b. Add last digit of num to sum_
#    c. Remove last digit from num
# 3. Return sum_
class AddDigits:
    def add_digits(self, num):
        sum_ = 0                # Step 1: Initialize sum_
        while num > 0 or sum_ > 9:  # Step 2: Loop until single digit
            if num == 0:        # Step 2a: If num is 0, reset
                num = sum_
                sum_ = 0
            sum_ += num % 10    # Step 2b: Add last digit
            num //= 10          # Step 2c: Remove last digit
        return sum_             # Step 3: Return result

if __name__ == "__main__":
    solver = AddDigits()

    # Test case 1
    num1 = 38
    result1 = solver.add_digits(num1)
    print(f"Test case 1: {result1}")  # Expected: 2

    # Test case 2
    num2 = 0
    result2 = solver.add_digits(num2)
    print(f"Test case 2: {result2}")  # Expected: 0

    # Test case 3
    num3 = 12345
    result3 = solver.add_digits(num3)
    print(f"Test case 3: {result3}")  # Expected: 6
