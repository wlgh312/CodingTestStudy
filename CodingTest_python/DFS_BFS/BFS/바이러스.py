from collections import deque
answer=[]
n = int(input())
m = int(input())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
visited=[False]*(n+1)

def bfs(v):
    queue=deque([v])
    visited[v]=True
    while queue:
        p=queue.popleft()
        answer.append(p)
        for i in graph[p]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
bfs(1)
print(len(answer)-1)
