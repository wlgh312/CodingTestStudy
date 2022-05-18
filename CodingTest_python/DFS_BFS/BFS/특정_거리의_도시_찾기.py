from collections import deque
n, m, k, x = map(int, input().split())
graph = [[] for _ in range(n+1)]
distance=[0]*(n+1)
for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
def bfs():
    q=deque([x])
    while q:
        v = q.popleft()
        for next in graph[v]:
            if distance[next]==0:
                distance[next]=distance[v]+1
                q.append(next)

bfs()
for i in range(len(distance)):
    if distance[i]==k:
        print(i)
if distance.count(k)==0:
    print(-1)

