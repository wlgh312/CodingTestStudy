s = input()
alpha=[]
num=0
for i in s:
    if i.isalpha():
      alpha.append(i)
    else:
        num+=int(i)

alpha.sort()
for i in alpha:
    print(i, end="")
print(num)
