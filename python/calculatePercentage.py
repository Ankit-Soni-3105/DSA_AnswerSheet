# Calculate total marks and percentage
maths = int(input("Enter Maths marks: "))
computer = int(input("Enter Computer marks: "))
english = int(input("Enter English marks: "))
total = maths + computer + english
percentage = (total / 300.0) * 100
print(f"Total Marks: {total}")
print(f"Percentage: {percentage:.2f}%")
