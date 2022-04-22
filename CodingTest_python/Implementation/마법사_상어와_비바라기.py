import sys
from collections import deque
input=sys.stdin.readline
n, m = map(int, input().split())
sky = [list(map(int, input().split())) for _ in range(n)]
dir=[(0,-1), (-1, -1), (-1, 0), (-1, 1), (0, 1), (1, 1), (1, 0), (1, -1)]#이동 방향
cloud = [(n-1, 0), (n-1, 1), (n-2, 0), (n-2,1)]#현재 구름 위치
cloud = deque(cloud)#삽입, 삭제가 자주 일어나는 경우 큐 사용
#구름 이동, 물 양 1씩 증가
def move(a, b):
    #원래 구름 위치 pop한 뒤, 새로운 구름 위치 append하므로 큐의 popleft 이용(선입선출)
    size=len(cloud)
    for _ in range(size):
        x, y=cloud.popleft()
        #배열의 앞과 끝이 연결되어 있는 경우 인덱스 이동
        nx = (x+dir[a][0]*b)%n
        ny = (y+dir[a][1]*b)%n
        if nx<0:
            nx+=n
        if ny<0:
            ny+=n

        cloud.append((nx, ny))#새로운 구름 위치 push
        visited[nx][ny]=True#구름이 사라진 칸 표시
        sky[nx][ny]+=1#물 양 증가
#물복사버그 마법
def watercopy():
    while cloud:
        x, y = cloud.popleft()#현재 바구니 위치
        for i in range(1, 8, 2):#대각선에 위치한 바구니 확인
            nx = x+dir[i][0]#현재 바구니의 대각선 위치의 x좌표
            ny = y+dir[i][1]
            if 0<=nx<n and 0<=ny<n and sky[nx][ny]>0:#배열 경계를 안넘어가는 경우 바구니에 물이 있으면
                sky[x][y]+=1#물 양 증가

for i in range(m):
    visited=[[False]*n for _ in range(n)]
    d, s = map(int, input().split())
    move(d-1,s)
    watercopy()
    for i in range(n):
        for j in range(n):
            if not visited[i][j] and sky[i][j]>=2:
                cloud.append((i, j))
                sky[i][j]-=2
result=0
for i in sky:
    result+=sum(i)

print(result)
