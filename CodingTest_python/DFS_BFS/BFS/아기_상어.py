from collections import deque
INF=int(1e9)
n = int(input())
array = [list(map(int, input().split())) for _ in range(n)]
baby=2
for i in range(len(array)):
    if 9 in array[i]:
        baby_idx = [i, array[i].index(9)]
        array[baby_idx[0]][baby_idx[1]]=0
dir=[(-1,0),(0,-1),(0,1),(1,0)]
def bfs():
    dist=[[-1]*n for _ in range(n)]
    q=deque([(baby_idx[0], baby_idx[1])])
    dist[baby_idx[0]][baby_idx[1]]=0
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x+dir[i][0]
            ny = y+dir[i][1]
            if 0<=nx<n and 0<=ny<n:
                if dist[nx][ny]==-1 and array[nx][ny]<=baby:
                    dist[nx][ny]=dist[x][y]+1
                    q.append((nx, ny))
    return dist
def find(dist):
    x, y = 0, 0
    min_dist = INF
    for i in range(n):
        for j in range(n):
            if dist[i][j]!=-1 and 1<=array[i][j]<baby:
                if dist[i][j]<min_dist:
                    x, y = i, j
                    min_dist = dist[i][j]
    if min_dist==INF:
        return None
    else:
        return x, y, min_dist
answer=0

while True:
    value=find(bfs())
    if value == None:
        print(answer)
        break
    else:
        baby_idx=[value[0], value[1]]
        answer+=value[2]
        array[baby_idx[0]][baby_idx[1]]=0

