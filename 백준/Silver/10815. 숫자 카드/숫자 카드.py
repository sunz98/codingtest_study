import sys
sys.setrecursionlimit(10**7)


def main():
    N = int(input())
    arr = list(map(int, sys.stdin.readline().split()))

    M = int(input())
    card = list(map(int, sys.stdin.readline().split()))
    res = []

    arr.sort()

    for i in card:
        res.append(find(arr, 0, N-1, i))

    res_str = list(map(str, res))
    print(' '.join(res_str))


def find(arr, start, last, num):
    if start > last:
        return 0
    else:
        mid = (start + last) // 2
        if arr[mid] < num:
            return find(arr, mid + 1, last, num)
        elif arr[mid] > num:
            return find(arr, start, mid - 1, num)
        else:
            return 1


if __name__ == "__main__":
    main()
