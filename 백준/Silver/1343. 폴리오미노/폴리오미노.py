import sys

board = sys.stdin.readline()
ans = ""
cnt = 0

for i in range(len(board)):
    if board[i] == 'X':
        cnt += 1
    else:
        if (cnt % 2 == 0):
            if (cnt >= 4):
                for j in range(cnt // 4):
                    ans += "AAAA"
                    cnt -= 4
            for j in range(cnt // 2):
                ans += "BB"
                cnt -= 2
            if (i != len(board) - 1):
                ans += "."
        else:
            print(-1)
            exit()
print(ans)
