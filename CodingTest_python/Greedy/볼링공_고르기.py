n, m = map(int, input().split())
ball = list(map(int, input().split()))
answer=0
for b in ball:
    answer+=len(ball)-ball.count(b)
print(answer//2)
