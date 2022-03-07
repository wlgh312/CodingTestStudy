n, m = map(int, input().split())
a, b, d = map(int, input().split())

maplist=[]
for i in range(n):
    maplist.append(list(map(int, input().split())))
maptwo=maplist
dir=[[-1,0],[0,1],[1,0],[0,-1]]

cnt=1
now=[a,b]
turn=0
while True:
    d-=1
    if d<0:
        d=3
    if maptwo[now[0]+dir[d][0]][now[1]+dir[d][1]]==0:
        cnt+=1
        maptwo[now[0]+dir[d][0]][now[1]+dir[d][1]]=1
        now[0]+=dir[d][0]
        now[1]+=dir[d][1]
    else:
        turn+=1
        if turn==4:
            t=d+2
            if t==4:
                t=0
            elif t==5:
                t=1
            if maplist[now[0]+dir[t][0]][now[1]+dir[t][1]]==0:
                now[0]+=dir[t][0]
                now[1]+=dir[t][0]
            else:
                break
            turn=0

print(cnt)

