A = int(input())
T = int(input())
C = int(input())

arr = []
cnt_0 = cnt_1 = 1
turn = 0

while True:
    cnt = cnt_0
    turn += 1

    for i in range(2):
        arr.append((cnt_0, 0))
        cnt_0 += 1
        arr.append((cnt_1, 1))
        cnt_1 += 1
    for i in range(turn + 1):
        arr.append((cnt_0, 0))
        cnt_0 += 1
    for i in range(turn + 1):
        arr.append((cnt_1, 1))
        cnt_1 += 1

    if cnt < T < cnt_0:
        print(arr.index((T, C)) % A)
        break
