import math

N = int(input())

if (N != 1):
    for i in range(2, N+1):
        if (N % i == 0):
            while (N % i == 0):
                N = N / i
                print(i)
