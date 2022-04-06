def solution(lottos, win_nums):
    answer = []
    a = 0#같은 숫자 갯수
    rank=[6, 6, 5, 4, 3, 2, 1]
    for w in win_nums:
        if w in lottos:
            a+=1
    zero = lottos.count(0)#0 갯수
    answer.append(rank[a+zero])#최고 순위
    answer.append(rank[a])#최저 순위
    return answer

print(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]))
