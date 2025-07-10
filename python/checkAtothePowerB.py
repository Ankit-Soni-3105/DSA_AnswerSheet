# Calculate a to the power of b
a = int(input("Enter base (a): "))
b = int(input("Enter exponent (b): "))
result = 1
for _ in range(b):
    result *= a
print(f"{a}^{b} = {result}")
