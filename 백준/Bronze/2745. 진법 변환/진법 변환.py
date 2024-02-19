import sys

N, B = map(str, sys.stdin.readline().split(' '))
N = list(N)
B = int(B)
res = 0

num = len(N)
for i in range(num):
    word = ord(N[num-i-1])
    if (word < 65):        # 숫자인 경우
        res += (word - 48) * (B ** i)
    else:                       # 알파벳인 경우
        res += (word - 55) * (B ** i)
print(res)
