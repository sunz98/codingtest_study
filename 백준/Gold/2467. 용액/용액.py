import sys

N = int(input())
arr = list(map(int, sys.stdin.readline().split(' ')))

# two pointer
left, right = 0, N-1

min_sum = abs(arr[left] + arr[right])   # -1 -> 1
left_num = arr[left]  # -99
right_num = arr[right]  # 98

# code Start
while left < right:
    left_right_sum = arr[left] + arr[right]

    if abs(left_right_sum) < min_sum:      # 왼쪽 + 오른ㅉ고이 이전 왼쪽 + 오른쪽보다 작은 경우
        left_num = arr[left]
        right_num = arr[right]
        min_sum = abs(left_right_sum)

        if left_right_sum == 0:
            break

    if left_right_sum < 0:
        left += 1
    else:
        right -= 1

print(left_num, right_num)
