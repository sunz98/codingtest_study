import sys
from collections import deque
queue = deque([])
cnt = 0

def push(num):
    queue.append(num)


def pop():
    if len(queue) == 0:
        print(-1)
    else:
        print(queue.popleft())
    
def size():
    print(len(queue))


def empty():
    if (len(queue) == 0):
        print(1)
    else:
        print(0)


def front():
    if len(queue) == 0:
        print(-1)
    else:
        print(queue[0])


def back():
    if len(queue) == 0:
        print(-1)
    else:
        print(queue[-1])


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
    elif a == "front":
        front()
    elif a == "back":
        back()
