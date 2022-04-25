n = int(input())
k = int(input())
array = [map(int, input().split()) for _ in range(k)]
l = int(input())
move = [map(input().split()) for _ in range(l)]
snake=[0,0]
dir=[(0,1), (-1,0), (0,-1), (1, 0)]
dir_idx=0
def snakemove():
    snake[0]+=dir[dir_idx][0]
    snake[1]+=dir[dir_idx][0]

def eat(apple):
    
