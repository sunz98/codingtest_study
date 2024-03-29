import sys

N = int(sys.stdin.readline())
min = 0
max = 0

if N % 5 != 0:
    min = (N // 5) + 1
else:
    min = N // 5

if N % 3 != 0:
    max = (N // 3) + 1
else:
    max = N // 3

dp = [[0 for i in range(max + 1)] for j in range(max + 1)]

res = 0
for i in range(min, max + 1):
    res = -1

    for j in range(i + 1):
        dp[j][i - j] = (3 * j) + (5 * (i - j))
        if dp[j][i - j] == N:
            res = i
            break

    if res != -1:
        break

print(res)
