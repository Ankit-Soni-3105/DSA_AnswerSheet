# Copy array in reverse order
n = int(input("Enter size: "))
arr = []
print("Enter elements:")
for _ in range(n):
    arr.append(int(input()))
rev = arr[::-1]
print("Reversed Array:", end=" ")
for num in rev:
    print(num, end=" ")
print()
