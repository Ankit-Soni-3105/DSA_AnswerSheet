# Check if user is a valid voter
name = input("Enter your name: ")
age = int(input("Enter your age: "))
if age >= 18:
    print(f"Hello {name}, you are a valid voter.")
else:
    print(f"Sorry {name}, you can't cast the vote.")
    years_left = 18 - age
    print(f"You will be eligible after {years_left} years.")
