n = int(input())
a=0
b=0
idx=len(str(n))//2
for i in range(len(str(n))):
    if i<idx:
        a+=n%10
    else:
        b+=n%10
    n=n//10
print("LUCKY" if a==b else "READY" )
