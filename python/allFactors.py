# Print all factors of a given number
num = int(input("Enter number: "))
print("Factors:", end=" ")
for i in range(1, num + 1):
    if num % i == 0:
        print(i, end=" ")
print()
