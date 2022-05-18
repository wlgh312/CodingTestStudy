s = str(input())
zero, one = 0, 0
pre=""
for i in range(len(s)):
    if pre!=s[i] or i==len(s)-1:
        if pre=="0":
            zero+=1
        elif pre=="1":
            one+=1
        pre=s[i]
    elif pre==s[i]:
        continue

print(min(zero, one))

        
