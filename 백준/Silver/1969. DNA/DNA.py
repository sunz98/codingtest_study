import sys

N, M = map(int, sys.stdin.readline().split(' '))
arr = []
res = ""
alp = ['A', 'C', 'G', 'T']
hamming_distance = 0

for i in range(N):
    arr.append(input())

for i in range(M):
    a_cnt = 0
    c_cnt = 0
    g_cnt = 0
    t_cnt = 0

    for j in range(N):
        if arr[j][i] == alp[0]:
            a_cnt += 1
        elif arr[j][i] == alp[1]:
            c_cnt += 1
        elif arr[j][i] == alp[2]:
            g_cnt += 1
        elif arr[j][i] == alp[3]:
            t_cnt += 1

    cnt_arr = [a_cnt, c_cnt, g_cnt, t_cnt]
    most_dna = alp[cnt_arr.index(max(cnt_arr))]
    res += most_dna

    for k in range(N):
        if arr[k][i] != most_dna:
            hamming_distance += 1

print(res)
print(hamming_distance)
