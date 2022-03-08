n = int(input())
array=[input() for x in range(n)]
array.sort(reverse=True)#array=sorted(array, reverse=True)
for i in array:
    print(i, end=' ')
