# Check if array is sorted in ascending order
arr = [1, 5, 8, 9, 10, 15]
is_sorted = True
for i in range(1, len(arr)):
    if arr[i] < arr[i - 1]:
        is_sorted = False
        break
print("YES" if is_sorted else "NO")
