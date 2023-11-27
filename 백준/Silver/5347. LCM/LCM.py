import sys

N = int(input())
for i in range(N):
    A, B = map(int, sys.stdin.readline().split(' '))
    a, b = max(A, B), min(A, B)

    while (b != 0):
        a, b = b, a % b

    print(int(A * B / a))
