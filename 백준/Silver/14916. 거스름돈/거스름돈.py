import sys

N = int(sys.stdin.readline())
list = []
cnt = 0

big = N // 5
for i in range(big):
    list.append(5)
    cnt += 5

while (True):
    num = (N - cnt) % 2
    if (num == 0):
        for i in range((N - cnt) // 2):
            list.append(2)
            cnt += 2
        break
    else:
        if (len(list) == 0):
            break
        else:
            list.pop()
            cnt -= 5


if len(list) == 0:
    print(-1)
else:
    print(len(list))
