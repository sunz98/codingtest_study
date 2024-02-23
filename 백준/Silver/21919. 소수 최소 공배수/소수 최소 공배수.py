import sys

N = int(input())
num = list(map(int, sys.stdin.readline().strip().split(' ')))

res = 1

NoPrime = []

for i in range(N):
    if not num[i] in NoPrime:
        for j in range(2, num[i]):
            tmp = num[i] % j
            if tmp == 0 :
                break
        else :
            res *= num[i]
            NoPrime.append(num[i])
if res == 1:
    res = -1

print(res)
