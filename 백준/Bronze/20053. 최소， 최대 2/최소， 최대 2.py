import sys

T = int(input())
for i in range(T):
    N = int(input())
    arr = list(map(int, sys.stdin.readline().split(' ')))
    print(min(arr), max(arr))
