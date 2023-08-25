import sys

# 보통 받아올 때 standard input으로 받아오게 하는 형식. 외우자!
# split 함수로 띄어쓰기 인식하기
A, B = map(int, sys.stdin.readline().split())

bigOne = max(A, B)
smallOne = min(A, B)

# 유클리드 호제법 사용
a, b = bigOne, smallOne

while b != 0:
    a = a % b
    a, b = b, a

print(a)
print(A*B//a)
