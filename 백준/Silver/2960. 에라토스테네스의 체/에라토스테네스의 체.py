import sys

N, K = map(int, sys.stdin.readline().split(' '))
num_list = []
remove = []

for i in range(2, N+1):
    num_list.append(i)
    remove.append(0)

cnt = 0
idx = 0
while True:
    for i in range(len(num_list)):
        P = num_list[idx]

        if (num_list[i] % P == 0):
            if (remove[i] == 0):
                cnt += 1
                remove[i] = 1

            if (cnt == K):
                print(num_list[i])
                exit(0)
    idx += 1
