import sys

num = int(sys.stdin.readline())

a = 0
b = 1
res = 0

if num == 0:
    res = a
if num == 1:
    res = b

for i in range(num - 1):
    res = a + b
    a, b = b, res

print(int(res))
