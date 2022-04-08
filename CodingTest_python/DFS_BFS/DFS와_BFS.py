from collections import deque
dfs_answer=[]
bfs_answer=[]
n, m, v = map(int, input().split())
graph=[[] for _ in range(n+1)]#노드 번호 그대로 사용할 수 있도록 n+1크기의 배열 사용
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
for i in graph:
    i.sort()
visited=[False]*(n+1)

def dfs(start):
    visited[start]=True
    dfs_answer.append(start)
    for i in graph[start]:
        if not visited[i]:
            dfs(i)

def bfs(start):
    queue=deque([start])
    visited[start]=True
    while queue:
        v=queue.popleft()
        bfs_answer.append(v)
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
dfs(v)
visited=[False]*(n+1)
bfs(v)
print(dfs_answer)
print(bfs_answer)
