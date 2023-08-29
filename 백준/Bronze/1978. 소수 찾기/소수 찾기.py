import sys
import math

num = int(input())
numList = list(map(int, sys.stdin.readline().split(' ')))
res = []

for i in (numList):
    if i != 1:
        cnt = 0
        for j in range(2, i):
            if i % j == 0:
                cnt += 1

        if cnt == 0:
            res.append(i)

print(len(res))
