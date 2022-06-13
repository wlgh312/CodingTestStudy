n = int(input())
money=list(map(int, input().split()))
money.sort()
all = sum(money)
target = 1
for i in money:
    if target<i:
        break
    target+=i
print(target)
