#시간 복잡도를 줄이기 위해서 반복문 대신 dictionary 사용
def solution(id_list, report, k):
    answer = [0]*len(id_list)
    warn = {id:0 for id in id_list}#신고당한 횟수
    report_dict = {id:[] for id in id_list}#신고한 사람 : 신고당한 사람
    for i in report:
        key=i.split()[0]
        v=i.split()[1]
        if v not in report_dict[key]:#동일한 사람을 신고한 경우를 걸러내기 위한 조건문
            report_dict[key].append(v)#신고 관계 추가
            warn[v]+=1#신고당한 횟수 증가
    for key, value in report_dict.items():
        for v in value:
            if warn[v]>=k:#신고당한 횟수가 k번 이상인 사람들만 확인
                answer[id_list.index(key)]+=1#신고한 사람에 해당하는 인덱스 찾아서 값 증가(처리 결과 메일 받은 횟수)
    return answer

print(solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2))
