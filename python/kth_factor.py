
# Algorithm: Find the k-th factor of n
# 1. Iterate from 1 to n
# 2. For each i, check if i is a factor of n
# 3. If yes, decrement k
# 4. If k becomes 0, return i (the k-th factor)
# 5. If no k-th factor is found, return -1

class KthFactor:
    def kth_factor(self, n, k):
        for i in range(1, n + 1):  # Step 1: Iterate from 1 to n
            if n % i == 0:         # Step 2: Check if i is a factor of n
                k -= 1             # Step 3: Decrement k for each factor found
                if k == 0:         # Step 4: If k is 0, return current factor
                    return i
        return -1                  # Step 5: If no k-th factor, return -1


if __name__ == "__main__":
    solver = KthFactor()

    # Test case 1
    n1, k1 = 12, 3
    result1 = solver.kth_factor(n1, k1)
    print(f"Test case 1: {result1}")  # Expected: 3

    # Test case 2
    n2, k2 = 7, 2
    result2 = solver.kth_factor(n2, k2)
    print(f"Test case 2: {result2}")  # Expected: -1

    # Test case 3
    n3, k3 = 100, 5
    result3 = solver.kth_factor(n3, k3)
    print(f"Test case 3: {result3}")  # Expected: 20
