n = int(input())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))
house=[]
answer=[]
def dfs(x, y, cnt):
    if x<0 or x>=n or y<0 or y>=n:
        return False
    if graph[x][y]==1:
        house[cnt]+=1
        graph[x][y]=0
        dfs(x-1, y, cnt)
        dfs(x+1, y, cnt)
        dfs(x, y-1, cnt)
        dfs(x, y+1, cnt)
        return True
cnt=0
for i in range(n):
    for j in range(n):
        house.append(0)
        dfs(i, j, cnt)
        cnt+=1
for i in house:
    if i>0:
        answer.append(i)
answer.sort()
print(len(answer))
for i in answer:
    print(i)
