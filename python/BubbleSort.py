# Bubble Sort implementation
arr = [5, 2, 8, 1, 3]
for i in range(len(arr) - 1):
    for j in range(len(arr) - 1 - i):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]
print(f"Sorted Array: {arr}")
