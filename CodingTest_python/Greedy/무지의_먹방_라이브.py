food_items = list(map(int, input().split))
k = int(input())
for i in range(len(food_items)):
    food_items[i]-=1
    if i==len(food_items)-1:
        i=-1
