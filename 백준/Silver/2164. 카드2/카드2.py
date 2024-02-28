from collections import deque

N = int(input())

arr = []
for i in range(N):
    arr.append(i + 1)
arr = deque(arr)

for i in range(N - 1):
    arr.popleft()
    arr.append(arr.popleft())

print(arr[0])
