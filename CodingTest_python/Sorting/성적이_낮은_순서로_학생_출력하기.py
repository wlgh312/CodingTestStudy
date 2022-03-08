n = int(input())
array=[]
for i in range(n):
    a=input().split()
    array.append((a[0], a[1]))
array.sort(key=lambda s:s[1])
for i in array:
    print(i[0], end=' ')
