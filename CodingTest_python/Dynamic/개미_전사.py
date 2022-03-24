n=int(input())
array=list(map(int, input().split()))
dp=[0]*n
dp[0]=array[0]
dp[1]=array[1]
for i in range(2, n):
    #두 가지만 확인하면 가능
    #i-1번째 식량창고를 털기로 결정한 경우 현재 식량창고는 털 수 없음
    #i-2번째 식량창고를 털기로 결정한 경우 현재 식량창고를 털 수 있음
    #따라서 (i-1)번째 식량창고를 턴 경우와 i-2번째&현재 식량창고를 턴 경우 중 더 많은 식량을 얻는 경우를 선택
    dp[i]=max(dp[i-1], dp[i-2]+array[i])
print(dp[n-1])
