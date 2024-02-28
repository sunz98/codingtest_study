import sys
from collections import deque
Deque = deque([])

def push_front(num) :
    Deque.appendleft(num)

def push_back(num) :
    Deque.append(num)

def pop_front() :
    if len(Deque) == 0 :
        print(-1)
    else :
        print(Deque.popleft())

def pop_back() :
    if len(Deque) == 0 :
        print(-1)
    else :
        print(Deque.pop())

def size() :
    print(len(Deque))

def empty() :
    if (len(Deque) == 0) :
        print(1)
    else :
        print(0)
    
def front():
    if len(Deque) == 0:
        print(-1)
    else:
        print(Deque[0])


def back():
    if len(Deque) == 0:
        print(-1)
    else:
        print(Deque[-1])



N = int(input())

for i in range(N):
    ins = list(map(str, sys.stdin.readline().strip().split(' ')))
    a = str(ins[0])
    if a == "push_front":
        b = int(ins[1])
        push_front(b)
    elif a == "push_back" :
        b = int(ins[1])
        push_back(b)
    elif a == "pop_front":
        pop_front()
    elif a == "pop_back" :
        pop_back()
    elif a == "size":
        size()
    elif a == "empty":
        empty()
    elif a == "front":
        front()
    elif a == "back":
        back()
