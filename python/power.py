

# Algorithm: Calculate x raised to the power n (recursive)
# 1. If n is 0, return 1
# 2. If n is negative, return 1 / x^(-n)
# 3. If n is odd, return x * x^(n-1)
# 4. If n is even, return (x*x)^(n//2)
class Power:
    def my_pow(self, x, n):
        if n == 0:                # Step 1: n is 0
            return 1
        if n < 0:                 # Step 2: n is negative
            return 1 / self.my_pow(x, -n)
        if n % 2 == 1:            # Step 3: n is odd
            return x * self.my_pow(x, n - 1)
        return self.my_pow(x * x, n // 2)  # Step 4: n is even

if __name__ == "__main__":
    solver = Power()

    # Test case 1
    x1, n1 = 2.0, 10
    result1 = solver.my_pow(x1, n1)
    print(f"Test case 1: {result1}")  # Expected: 1024.0

    # Test case 2
    x2, n2 = 2.1, 3
    result2 = solver.my_pow(x2, n2)
    print(f"Test case 2: {result2}")  # Expected: 9.261

    # Test case 3
    x3, n3 = 2.0, -2
    result3 = solver.my_pow(x3, n3)
    print(f"Test case 3: {result3}")  # Expected: 0.25
