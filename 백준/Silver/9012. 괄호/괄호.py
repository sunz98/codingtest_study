N = int(input())

for i in range(N):
    line = input()
    arr = [i for i in line]
    front = 0
    back = 0
    cnt = 0

    for i in range(len(arr)):
        if arr[i] == '(':
            front += 1
            cnt += 1
        elif arr[i] == ')':
            back += 1
            cnt -= 1
        if cnt < 0:
            break

    if arr[-1] == '(':
        print("NO")
    else:
        if (front == back):
            print("YES")
        else:
            print("NO")
