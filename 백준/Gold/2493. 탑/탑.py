import sys
from collections import deque

N = int(input())
arr = list(map(int, sys.stdin.readline().split(' ')))
stack = []
res = deque([])

for i in range(N):
    while stack:
        if stack[-1][1] > arr[i]:
            res.append(stack[-1][0] + 1)
            break
        else:
            stack.pop()
    if not stack:
        res.append(0)
    stack.append([i, arr[i]])

print(" ".join(map(str, res)))
