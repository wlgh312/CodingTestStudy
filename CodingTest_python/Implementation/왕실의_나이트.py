idx=input()
row=idx[0]
col=int(idx[-1])
alp='abcdefgh'
row=alp.index(row)+1

dir=[[2,1],[2,-1],[-2,1],[-2,-1],[1,2],[1,-2],[-1,2],[-1,-2]]
cnt=0
for i in dir:
    if row+i[0]>8 or row+i[0]<1:
        if col+i[1]>8 or row+i[1]<1:
            cnt+=1

print(cnt)
