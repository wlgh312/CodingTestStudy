s=input()
answer=int(s[0])
for i in range(1, len(s)):
    pren=int(s[i-1])
    n=int(s[i])
    if 0<=pren<=1 or 0<=n<=1:
        answer+=n
    else:
        answer*=n
print(answer)
