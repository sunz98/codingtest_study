import sys

T = int(input())
num_list = []

for i in range(T):
    A, B = map(int, sys.stdin.readline().split(' '))
    a, b = max(A, B), min(A, B)

    while True:
        a = a % b
        a, b = b, a
        if (b == 0):
            break

    num_list.append(int(A * B / a))

for i in range(T):
    print(num_list[i])
