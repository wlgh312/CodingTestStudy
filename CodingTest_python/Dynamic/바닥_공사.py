n=int(input())
def solution(n):
    answer=0
    dp=[0]*(n+1)
    dp[1]=1#n=1인 경우 2x1만 가능
    dp[2]=3#n=2인 경우 1x2 or 2x2 가능
    for i in range(3, n+1):#앞의 두 방법 이후에 바닥을 덮는 방법
        #i번째 바닥을 덮기 위해서는 1개 전 바닥을 덮을 경우와 2개 전 바닥을 덮을 경우를 생각해보면 된다.
        #덮어야될 바닥이 1개 전인 경우에서 2x1로 덮는 경우(dp[i-1])만 i번째 바닥을 덮을 수 있다.
        #덮어야될 바닥이 2개 전인 경우에서는 1x2로 덮는 경우와 2x2로 덮는 경우(dp[i-2]*2) 두 방법으로 i번째 바닥을 덮을 수 있다.
        dp[i]=(dp[i-1]+dp[i-2]*2)%796796
    answer=dp[n]
    return answer
print(solution(n))
