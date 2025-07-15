
# Algorithm: Check if a number is a power of two
# 1. If n is 1, return True (since 2^0 = 1)
# 2. If n is 0 or n is odd, return False (not a power of two)
# 3. Otherwise, recursively check n // 2
class PowerOfTwo:
    def is_power_of_two(self, n):
        if n == 1:                  # Step 1: Check if n is 1
            return True
        if n == 0 or n % 2 == 1:    # Step 2: Check if n is 0 or odd
            return False
        else:
            return self.is_power_of_two(n // 2)  # Step 3: Recursively check n // 2


if __name__ == "__main__":
    solver = PowerOfTwo()

    # Test case 1
    n1 = 16
    result1 = solver.is_power_of_two(n1)
    print(f"Test case 1: {result1}")  # Expected: True

    # Test case 2
    n2 = 18
    result2 = solver.is_power_of_two(n2)
    print(f"Test case 2: {result2}")  # Expected: False

    # Test case 3
    n3 = 1
    result3 = solver.is_power_of_two(n3)
    print(f"Test case 3: {result3}")  # Expected: True
