T = int(input())


def gcd(a, b):
    x = max(a, b)
    y = min(a, b)

    while (y != 0):
        x, y = y, (x % y)

    return x


result = [0] * T
for idx in range(T):
    num_list = list(map(int, input().split(' ')))

    num = num_list.pop(0)
    for i in range(num):
        for j in range(i+1, num):
            result[idx] += gcd(num_list[i], num_list[j])


for idx in range(T):
    print(result[idx])
