n, m = map(int, input().split())
graph = []#stack
for i in range(n):
    graph.append(list(map(int, input())))

def bfs(x, y):
    if x<=-1 or x>=n or y<=-1 or y>=m:
        return False
    if graph[x][y]==0:
        graph[x][y]=1
        bfs(x+1, y)
        bfs(x-1, y)
        bfs(x, y+1)
        bfs(x, y-1)
        return True
result=0
for i in range(n):
    for j in range(m):
        if bfs(i, j)==True:
            result+=1
print(result)
