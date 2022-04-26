from collections import deque
n = int(input())
k = int(input())
apple = [map(int, input().split()) for _ in range(k)]
l = int(input())
move = [input().split() for _ in range(l)]
board=[[0]*(n+1) for _ in range(n+1)]#보드
board[1][1]=1#뱀의 첫위치
head=[1,1]#뱀머리 위치
snake=deque([(1, 1)])
cnt=0
dir=[(0,1), (1,0), (0,-1), (-1, 0)]
d=0
for a, b in apple:#사과있는 칸을 -1로 초기화
    board[a][b]=-1
m=0
while True:
    nx=head[0]+dir[d][0]
    ny=head[1]+dir[d][1]
    if 1<=nx<=n and 1<=ny<=n and board[nx][ny]!=1:
        if board[nx][ny]==0:#사과가 없으면
            board[nx][ny]=1
            snake.append((nx, ny))
            tail=snake.popleft()
            board[tail[0]][tail[1]]=0
        if board[nx][ny]==-1:
            board[nx][ny]=1
            snake.append((nx, ny))
    else:
        print(head)
        print(board)
        cnt+=1
        break
    head[0]=nx
    head[1]=ny
    cnt+=1
    #뱀 이동 경로 표시
    if len(move)!=m and int(move[m][0])==cnt:#방향전환
        if move[m][1]=="L":
            d-=1 if d>0 else -3
        elif move[m][1]=="D":
            d+=1 if d<3 else -3
        m+=1
print(cnt)

