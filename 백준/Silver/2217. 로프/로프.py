N = int(input())
list = []
res = 0

for i in range(N):
    list.append(int(input()))

list.sort()

for i in range(N):
    if (res <= list[i] * (N - i)):
        res = list[i] * (N - i)

print(res)
