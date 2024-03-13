import sys
import math

num = list(map(int, sys.stdin.readline().split(' ')))

a = num[0]
b = num[1]
c = num[2]
d = num[3]
e = num[4]
f = num[5]

if a == 0:
    y = c / b
    x = (f - e * y) / d
elif d == 0 :
    y = f / e
    x = (c - b * y) / a
elif ((b * d) - (a * e)) == 0:
    x = c / (a + b)
    y = x
else:
    y = (c - f * a / d) * (d / ((b * d) - (e * a)))
    x = (c - b * y) / a

print(round(x), end=" ")
print(round(y))
