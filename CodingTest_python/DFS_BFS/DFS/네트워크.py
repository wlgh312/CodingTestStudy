def solution(n, computers):
    answer = 0
    visited=[0] * n
    def dfs(i):
        visited[i]=1
        for j in range(n):
            if computers[i][j] and not visited[j]:#연결되어있으면서 방문하지않은 노드인 경우
                dfs(j)

    for i in range(n):
        if not visited[i]:
            dfs(i)
            answer+=1
    return answer

print(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]))
