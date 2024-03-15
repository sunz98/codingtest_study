import sys

A, B, C, M = map(int, sys.stdin.readline().split(' '))
cnt = 0
res = 0

for i in range(24):
    if cnt <= (M - A):
        cnt += A
        res += B
    else:
        cnt -= C
    if cnt < 0:
        cnt = 0

print(res)
