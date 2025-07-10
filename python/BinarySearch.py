# Binary Search implementation
arr = [2, 4, 8, 10, 15, 20]
target = int(input("Enter element to search: "))
left, right = 0, len(arr) - 1
index = -1
while left <= right:
    mid = left + (right - left) // 2
    if arr[mid] == target:
        index = mid
        break
    elif arr[mid] < target:
        left = mid + 1
    else:
        right = mid - 1
print(f"Index: {index}")
