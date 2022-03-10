#정수가 1000자리!!! 이하일 떄
#숫자의 '문자열' 비교는 ASCII를 이용하여 비교(숫자 전체가 아닌 앞 자리 숫자부터 순서대로 비교)
#문자열(정수)*3을 하면 더 큰 숫자가 계속 반복된다.
#ex) [9, 991] -> [999, 991991991]
def solution(numbers):
    answer=[f'{n}' for n in numbers]
    answer.sort(key=lambda x : x*3, reverse=True)
    return str(int(''.join(answer)))#'000'은 사용하면 안되므로 '0'으로 다시 바꾸기 위해 int()사용

print(solution([3, 30, 34, 5, 9]))
