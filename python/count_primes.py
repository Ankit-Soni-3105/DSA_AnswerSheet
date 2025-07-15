
# Algorithm: Count number of prime numbers less than n (Sieve of Eratosthenes)
# 1. If n <= 2, return 0
# 2. Create a boolean list is_prime of size n, initialized to True
# 3. Set is_prime[0] and is_prime[1] to False
# 4. For each i from 2 to sqrt(n):
#    a. If is_prime[i] is True, mark all multiples of i as False
# 5. Return the count of True values in is_prime
class CountPrimes:
    def count_primes(self, n):
        if n <= 2:                  # Step 1: Handle small n
            return 0
        is_prime = [True] * n       # Step 2: Initialize prime list
        is_prime[0] = is_prime[1] = False  # Step 3: 0 and 1 are not prime
        for i in range(2, int(n ** 0.5) + 1):  # Step 4: Loop through possible primes
            if is_prime[i]:
                for j in range(i * i, n, i):  # Step 4a: Mark multiples as not prime
                    is_prime[j] = False
        return sum(is_prime)        # Step 5: Count primes

if __name__ == "__main__":
    solver = CountPrimes()

    # Test case 1
    n1 = 10
    result1 = solver.count_primes(n1)
    print(f"Test case 1: {result1}")  # Expected: 4

    # Test case 2
    n2 = 0
    result2 = solver.count_primes(n2)
    print(f"Test case 2: {result2}")  # Expected: 0

    # Test case 3
    n3 = 20
    result3 = solver.count_primes(n3)
    print(f"Test case 3: {result3}")  # Expected: 8
