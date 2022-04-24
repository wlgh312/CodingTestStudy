import sys
sys.setrecursionlimit(10**5)
n, q = map(int, input().split())
n=2**n
graph = [list(map(int, input().split())) for _ in range(n)]
dirx=[-1, 1, 0, 0]
diry=[0, 0, -1, 1]

#배열 회전
def rotate(l):
    k=2**l
    for x in range(0, n, k):
        for y in range(0, n, k):
            tmp = [graph[i][y:y+k] for i in range(x, x+k)]
            for i in range(k):
                for j in range(k):
                    graph[x+j][y+k-1-i]=tmp[i][j]

#얼음이 있는 칸 3개 이상과 인접해있지않은 경우 얼음의 양 감소
def firestorm():
    cnt=[[0] * n for _ in range(n)]
    for x in range(n):
        for y in range(n):
            for i in range(4):
                nx = x+dirx[i]
                ny = y+diry[i]
                if 0<=nx<n and 0<=ny<n and graph[nx][ny]>0:
                    cnt[x][y]+=1
    for x in range(0, n):
        for y in range(0, n):
            if graph[x][y]>0 and cnt[x][y]<3:
                graph[x][y]-=1

def dfs(graph, sx, sy):
    cnt=1
    graph[sx][sy]=0
    for d in range(4):
        nx = sx+dirx[d]
        ny = sy+diry[d]
        if 0<=nx<n and 0<=ny<n and graph[nx][ny]:
            cnt+=dfs(graph, nx, ny)
    return cnt

ice=0
big=0
for l in map(int, input().split()):
    rotate(l)
    firestorm()
ice=sum(sum(i) for i in graph)

for x in range(n):
    for y in range(n):
        if graph[x][y]>0:
            big = max(big, dfs(graph, x, y))

print(ice, big)
