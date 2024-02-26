import sys
stack = []


def push(num):
    stack.append(num)


def pop():
    if (len(stack) == 0):
        print(-1)
    else:
        num = stack[-1]
        stack.pop(-1)
        print(num)


def size():
    print(len(stack))


def empty():
    if (len(stack) == 0):
        print(1)
    else:
        print(0)


def top():
    if (len(stack) == 0):
        print(-1)
    else:
        print(stack[-1])


N = int(input())

for i in range(N):
    ins = list(map(str, sys.stdin.readline().strip().split(' ')))
    a = str(ins[0])
    if a == "push":
        b = int(ins[1])
        push(b)
    elif a == "pop":
        pop()
    elif a == "size":
        size()
    elif a == "empty":
        empty()
    elif a == "top":
        top()
