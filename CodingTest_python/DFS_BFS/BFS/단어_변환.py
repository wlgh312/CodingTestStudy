from collections import deque
def solution(begin, target, words):
    answer=[]
    queue=deque()
    queue.append((begin,0))
    visited=[0 for i in range(len(words))]
    if target not in words:
        return 0
    while queue:
        begin, cnt = queue.popleft()
        if begin == target:
            return cnt
        for i in range(len(words)):
            count=0
            if not visited[i]:
                for pair in zip(words[i], begin):#단어비교
                    if pair[0]!=pair[1]:
                        count+=1
                if count==1:#문자 1개만 차이나면 큐에 삽입
                    queue.append((words[i], cnt+1))
                    visited[i]=1
    return cnt

print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]))
