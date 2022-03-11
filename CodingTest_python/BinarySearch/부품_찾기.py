answer=[]
n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))
a.sort()
def bsearch(start, end, num):
    if start>end:
        return None
    mid=(start+end)//2
    if num == a[mid]:
        return mid
    elif num < a[mid]:
        return bsearch(start, mid-1, num)
    else:
        return bsearch(mid+1, end, num)

for num in b:
    result = bsearch(0, len(a)-1, num)
    if result is None:
        print("no", end=' ')
    else:
        print("yes", end=' ')
