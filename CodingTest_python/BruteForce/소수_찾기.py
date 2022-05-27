import math
from itertools import permutations
def solution(numbers):
    answer = 0
    #에라토스테네스의 체
    def is_prime_num(x):
        if x<2:
            return False
        for i in range(2, int(math.sqrt(x))+1):
            if x%i==0:
                return False
        return True

    num=[]
    for i in range(1, len(numbers)+1):
        num+=list(map(''.join, (permutations(numbers, i))))#순열
    num=list(set(map(int, num)))#중복 제거
    for i in num:
        if is_prime_num(int(i))==True:
            answer+=1
    return answer
print(solution("17"))
