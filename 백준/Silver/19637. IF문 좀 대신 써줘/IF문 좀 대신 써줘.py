import sys

N, M = map(int, sys.stdin.readline().split(' '))
level = []
power = []

for i in range(N):
    A, B = map(str, sys.stdin.readline().split(' '))
    # # 전투력은 내림차순으로 주어지고, 중복되면 먼저 입력된 칭호만 출력해야 하므로 중복 방지
    # if (int(B) not in power):
    #     level.append(A)
    #     power.append(int(B))
    level.append(A)
    power.append(int(B))

arr = []
for i in range(M):
    arr.append(int(sys.stdin.readline().strip()))

for i in arr :
    left = 0
    right = len(power)
    res = 0

    while left <= right :
        mid = (left + right) // 2
        if power[mid] >= i :
            res = mid
            right = mid - 1
        else :
            left = mid + 1
    print(level[res])
