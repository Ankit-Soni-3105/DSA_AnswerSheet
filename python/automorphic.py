# Check if a number is Automorphic (its square ends with the number itself)
num = int(input("Enter number: "))
sq = num * num
temp = num
count = 0
while temp > 0:
    count += 1
    temp //= 10
last_digits = sq % (10 ** count)
if last_digits == num:
    print(f"{num} is Automorphic")
else:
    print(f"{num} is not Automorphic")
