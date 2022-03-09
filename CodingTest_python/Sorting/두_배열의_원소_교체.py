n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort(reverse=True)
for i in range(k):
    if a[i]<b[i]:
        a[i], b[i]=b[i], a[i]
    else:#더 이상 작은 수가 없다면 반복문을 탈출하는게 더 빠름
        break

print(sum(a))
