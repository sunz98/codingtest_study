import sys

N = int(sys.stdin.readline())
ball = list(map(int, sys.stdin.readline().split(' ')))
index = []
ans = []

for i in range(N):
    index.append(i + 1)

idx = 0
tmp = ball.pop(idx)
ans.append(index.pop(idx))

while (ball):
    if tmp > 0:
        idx = (idx + tmp - 1) % len(ball)
    else:
        idx = (idx + tmp) % len(ball)
    tmp = ball.pop(idx)
    ans.append(index.pop(idx))

for i in ans:
    print(i, end=' ')
