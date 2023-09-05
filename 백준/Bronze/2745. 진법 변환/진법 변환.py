import sys

num = list(map(str, sys.stdin.readline().strip().split(' ')))
num[1] = int(num[1])
num[0] = list(num[0])
leng = len(num[0])
res = 0
for i in range(leng):
    if (ord(num[0][i]) > 64):
        num[0][i] = ord(num[0][i]) - 55
    else:
        num[0][i] = int(num[0][i])

    num[0][i] = num[0][i] * (num[1] ** (leng-i-1))

    res = res + num[0][i]

print(res)
