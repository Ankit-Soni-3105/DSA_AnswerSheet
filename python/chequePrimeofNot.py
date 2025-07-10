# Check if a number is prime
num = int(input("Enter number: "))
is_prime = True
if num <= 1:
    is_prime = False
else:
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            is_prime = False
            break
if is_prime:
    print(f"{num} is Prime")
else:
    print(f"{num} is not prime")
