import sys

N, K = map(int, sys.stdin.readline().split(' '))
arr = []
res = []

for i in range(N):
    arr.append(i)

idx = 0

while arr:
    idx = (idx + K - 1) % len(arr)  # Calculate the next index with a step of K
    res.append(arr.pop(idx) + 1)

print('<' + ', '.join(map(str, res)) + '>')
