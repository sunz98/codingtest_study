import sys

line = sys.stdin.readline()
cnt = 0
pipe = 0

for i in range(len(line)):
    if line[i] == '(':
        pipe += 1
    elif line[i] == ')':
        pipe -= 1
        if line[i - 1] == '(':
            cnt = cnt + pipe
        else:
            cnt += 1

sys.stdout.write(str(cnt))
