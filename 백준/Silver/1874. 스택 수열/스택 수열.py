N = int(input())

stack = []
ans = []

cnt = 1
available = True

for i in range(N):
    num = int(input())

    while cnt <= num:
        stack.append(cnt)
        ans.append("+")
        cnt += 1

    if stack[-1] == num:
        stack.pop()
        ans.append("-")
    else:
        available = False

if available == True:
    for i in ans:
        print(i)
else:
    print("NO")
