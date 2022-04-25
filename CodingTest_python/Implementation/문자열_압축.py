s = input()
res=len(s)
for i in range(1, len(s)//2+1):#문자열 자르는 크기 반복 2~len(s)/2까지
    compressed=""
    cnt=1
    tmp=s[0:i]
    for j in range(i, len(s),i):
        if tmp==s[j:j+i]:
            cnt+=1
        else:
            compressed+=str(cnt)+tmp if cnt>=2 else tmp
            tmp = s[j:j+i]
            cnt=1
    compressed+=str(cnt)+tmp if cnt>=2 else tmp
    print(compressed)
    res=min(res,len(compressed))
print(res)
