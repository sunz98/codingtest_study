import sys


def main():
    N, M = map(int, sys.stdin.readline().split(' '))
    dot = list(map(int, sys.stdin.readline().split(' ')))
    dot.sort()

    for i in range(M):
        start_dot, end_dot = map(int, sys.stdin.readline().split(' '))

        start = find(dot, start_dot, 0)
        end = find(dot, end_dot, 1)

        print(end - start + 1)


def find(dot, num, check):
    left = 0
    right = len(dot) - 1

    while left <= right:
        mid = (left + right) // 2

        if (dot[mid] > num):
            right = mid - 1
        elif (dot[mid] < num):
            left = mid + 1
        else:
            return mid

    if (check == 0):
        return right + 1
    else:
        return right


if __name__ == "__main__":
    main()
