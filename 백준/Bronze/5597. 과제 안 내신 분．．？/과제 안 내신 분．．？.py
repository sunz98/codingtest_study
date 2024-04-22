arr = [i for i in range(1, 31)]

for i in range(28):
    num = int(input())
    arr.remove(num)


for i in range(len(arr)):
    print(arr[i])
