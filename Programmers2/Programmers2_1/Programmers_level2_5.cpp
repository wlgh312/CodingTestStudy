#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
	vector<int> answer;
	queue<int> q;
	int n;
	int cnt = 1;
	for (int i = 0; i < progresses.size(); i++) {
		q.push(ceil((100 - progresses[i]) / (double)speeds[i]));
	}
	n = q.front();
	q.pop();
	while(true){
		if (q.empty()) {
			answer.push_back(cnt);
			break;
		}
		if (n >= q.front()) {
			q.pop();
			cnt++;
		}
		else {
			answer.push_back(cnt);
			n = q.front();
			q.pop();
			cnt = 1;
		}
	}
	return answer;
}
int main() {
	vector<int> progresses = { 93, 30, 55 };
	vector<int> speeds = {1, 30, 5};
	for (int v : solution(progresses, speeds)) {
		cout << v;
	}
}