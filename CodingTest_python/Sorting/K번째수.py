def solution(array, commands):
    answer = []
    for c in commands:
        s=sorted(array[c[0]-1:c[1]])
        answer.append(s[c[2]-1])
    return answer

print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))
