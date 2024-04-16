def main():
    N = int(input())
    print(find(0, N + 1, N))


def find(start, last, N):
    mid = (start + last) // 2

    if (mid ** 2 == N):
        return mid
    elif (mid ** 2 > N):
        if ((mid - 1) ** 2 < N):
            return mid
        else:
            return find(start, mid, N)
    else:
        return find(mid + 1, last, N)


if __name__ == "__main__":
    main()
