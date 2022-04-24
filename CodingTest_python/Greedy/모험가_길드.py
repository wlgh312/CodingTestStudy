n=int(input())
people=list(map(int, input().split()))
people.sort(reverse=True)
cnt=people[0]
answer=1
for i in people:
    if cnt==0:
        answer+=1
        cnt=i
    cnt-=1
print(answer)
