import sys

test = int(sys.stdin.readline())

for i in range(test):
    N, M = map(int, sys.stdin.readline().split(' '))
    dp = [[0 for j in range(M + 1)] for i in range(M + 1)]

    for i in range(1, M + 1):
        dp[1][i] = i

        for j in range(2, i + 1):
            dp[j][i] = dp[j - 1][i - 1] + dp[j][i - 1]

    print(dp[N][M])
