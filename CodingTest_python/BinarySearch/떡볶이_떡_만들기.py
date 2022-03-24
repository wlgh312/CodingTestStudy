N, M = list(map(int, input().split(' ')))
array = list(map(int, input().split()))

a=max(array)
b=min(array)
res=0
while res!=M:
    tmp=(a+b)//2
    tarray=[i-tmp for i in array]
    res=0
    for i in tarray:
        if i>0:
            res+=i
    if res<M:
        a=tmp
        tmp=(a+b)//2
    elif res>M:
        b=tmp
        tmp=(a+b)//2
print(res)
