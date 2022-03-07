n=int(input())
dir=input().split()

fir=1#행
sec=1#열
for i in dir:
    if i=='L' and sec!=1:
        sec-=1
    elif i=='R' and sec!=n:
        sec+=1
    elif i=='U' and fir!=1:
        fir-=1
    elif i=='D' and fir!=n:
        fir+=1

print(fir,sec)
