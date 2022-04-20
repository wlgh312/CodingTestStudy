import sys
import heapq#우선순위큐

input = sys.stdin.readline
INF = int(1e9)
n, m, c = map(int, input().split())
graph = [[] for i in range(n+1)]
time=[INF]*(n+1)
for _ in range(m):
    x, y, z = map(int, input().split())
    graph[x].append((y,z))
def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    time[start]=0
    while q:
        t, now = heapq.heappop(q)
        if time[now]<t:
            continue
        for i in graph[now]:
            cost = time[now]+i[1]
            if cost<time[i[0]]:
                time[i[0]]=cost
                heapq.heappush(q, (cost, i[0]))
dijkstra(c)
cnt=0
alltime=0
for i in time:
    if i!=INF and i>0:
        cnt+=1
        alltime=max(alltime, i)
print(cnt,alltime)
