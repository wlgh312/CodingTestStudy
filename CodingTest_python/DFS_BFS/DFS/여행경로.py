def solution(tickets):
    answer = []
    data=dict()
    for t in tickets:
        if t[0] in data:
            data[t[0]].append(t[1])
        else:
            data[t[0]]=[t[1]]#value가 여러개일 수 있으므로 배열 형태로 설정
    for k in data.keys():
        data[k].sort(reverse=True)#value를 반대로 정렬

    stack=['ICN']
    while stack:#스택 이용
        start = stack[-1]
        #알파벳 순서대로만 가면 경로가 존재하지않는 경우가 있을 수 있음
        #스택의 특성을 이용해서 경로가 없는 경우는 스택에 쌓기만 함
        if start not in data or len(data[start])==0:
            answer.append(stack.pop())#가장 마지막 노드인 경우 pop
        else:
            stack.append(data[start].pop())
    return answer[::-1]

print(solution([["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]))
