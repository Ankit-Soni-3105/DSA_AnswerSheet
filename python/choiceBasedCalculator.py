# Choice-based calculator
def calculator():
    while True:
        a = float(input("Enter first number: "))
        b = float(input("Enter second number: "))
        print("1. Add\n2. Subtract\n3. Multiply\n4. Divide")
        ch = int(input("Enter choice: "))
        if ch == 1:
            print(f"Sum: {a + b}")
        elif ch == 2:
            print(f"Difference: {a - b}")
        elif ch == 3:
            print(f"Product: {a * b}")
        elif ch == 4:
            if b != 0:
                print(f"Quotient: {a / b}")
            else:
                print("Cannot divide by zero!")
        else:
            print("Invalid choice")
        cont = input("Do you want to continue? (y/n): ")
        if cont.lower() != 'y':
            break

calculator()
