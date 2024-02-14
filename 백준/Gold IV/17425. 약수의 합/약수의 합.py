import sys
input = sys.stdin.readline
 
n = int(input())
MAX = 1000000
 
dp = [1] * (MAX+1)
sum = [0] * (MAX+1)
 
for i in range(2, MAX+1):
    j = 1
    while (i*j <= MAX):
        dp[i*j] += i
        j += 1
 
for i in range(1, MAX+1):
    sum[i] = sum[i-1] + dp[i]
 
for i in range(n):
    x = int(input())
    print(sum[x])