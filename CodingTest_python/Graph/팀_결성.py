n, m = map(int, input().split())
parents=[]
for i in range(n+1):
    parents.append(i)
def find(parent, x):#루트 노드 찾기
    if parent[x]!=x:
        parent[x]=find(parent, parent[x])
    return parent[x]
def union(parent, a, b):#합집합
    a = find(parent, a)
    b = find(parent, b)
    if a<b:
        parent[b]=a
    else:
        parent[a]=b
for _ in range(m):
    team, a, b = map(int, input().split())
    if team==0:
        union(parents, a, b)
    else:
        if find(parents, a)==find(parents, b):
            print("YES")
        else:
            print("NO")
