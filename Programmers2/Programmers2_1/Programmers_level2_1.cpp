/*
프린터
*/
#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> priorities, int location) {
	int answer = 0;
	priority_queue<int> p;//중요도 우선순위 큐
	queue<pair<int, int>> q;//중요도, 대기목록에서의 위치
	for (int i = 0; i < priorities.size(); i++) {
		p.push(priorities[i]);
		q.push(make_pair(priorities[i], i));
	}
	while (q.size() != 0) {//모든 문서가 프린트될때까지 반복
		if (q.front().first == p.top()) {//인쇄 대기중인 문서의 중요도가 가장 높으면
			answer++;//인쇄된 문서의 수 증가
			p.pop();//가장 중요도가 높은 문서 삭제
			if (q.front().second == location) {//인쇄요청한 문서의 위치와 일치하면
				break;//반복문 종료
			}
		}
		else {//더 높은 중요도를 가진 문서가 존재하면
			q.push(q.front());//맨 뒤에 다시 대기
		}
		q.pop();//맨 앞의 대기정보 삭제
	}
	return answer;
}
int main() {
	vector<int> priorities = { 2, 1, 3, 2};
	int location = 2;
	cout << solution(priorities, location);
}