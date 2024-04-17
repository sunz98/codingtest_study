import sys
sys.setrecursionlimit(10**6)

def main():
    N = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split(' ')))
    M = int(sys.stdin.readline())

    min_budget = min(arr)
    max_budget = max(arr)

    print(find(min_budget, max_budget, arr, M))


def find(min_budget, max_budget, arr, M):
    if (sum(arr) < M):
        return max_budget
    
    if (min_budget * len(arr)) > M :
        return find(1, max_budget, arr, M)

    while min_budget <= max_budget:
        mid = (min_budget + max_budget) // 2
        if calculate(arr, mid) <= M:
            result = mid
            min_budget = mid + 1
        else:
            max_budget = mid - 1

    return result


def calculate(arr, budget):
    sum = 0

    for i in arr:
        sum += min(i, budget)

    return sum


if __name__ == "__main__":
    main()
