n, m = list(map(int, input().split()))
money = [int(input()) for i in range(n)]
def solution(n, m):
    answer=0
    dp=[10001]*(m+1)#가능한 최소 화폐 개수를 확인해야하므로 -1대신 10001로 초기화
    for mon in money:#모든 화폐를 확인
        for j in range(mon, m+1):#현재 확인하는 화폐 가치부터 확인해야하는 최종 화폐 가치 합까지 확인
            #이전에 확인한 화폐를 사용한 경우의 수가 더 작을 수 있으므로 min으로 확인
            #현재 확인하는 화폐를 사용한 개수가 더 최소인 경우, 경우의 수 증가시켜야 하므로 +1
            dp[j]=min(dp[j], dp[j-mon]+1)
    if dp[m]==10001:
        answer=-1
    else:
        answer=dp[m]
    return answer

print(solution(n, m))
