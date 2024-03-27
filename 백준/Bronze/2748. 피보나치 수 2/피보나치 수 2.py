N = int(input())

arr = [0, 1]
for i in range(N - 1):
    arr.append(arr[-1] + arr[-2])

if N > 2:
    print(arr[-1])
else:
    print(arr[N])
