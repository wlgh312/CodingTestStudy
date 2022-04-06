#코드 간편성을 위해 플로이드 워셜 알고리즘 이용
n, m = map(int, input().split())
INF=int(1e9)
graph = [[INF]*(n+1) for _ in range(n+1)]
for i in range(n+1):
    graph[i][i]=0
for i in range(m):
    a, b = map(int, input().split())
    graph[a][b]=1
    graph[b][a]=1

x, k = map(int, input().split())

for a in range(1, n+1):
    for b in range(1, n+1):
        for c in range(1, n+1):
            graph[b][c] = min(graph[b][c], graph[b][a]+graph[a][c])

answer=graph[1][k]+graph[k][x]#1에서 k까지 가는 최소 시간+k에서 x까지 가는 최소 시간
print("-1" if answer>=INF else answer)#INF이상인 경우를 모두 확인해야 함
