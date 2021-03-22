/*
������
*/
#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> priorities, int location) {
	int answer = 0;
	priority_queue<int> p;//�߿䵵 �켱���� ť
	queue<pair<int, int>> q;//�߿䵵, ����Ͽ����� ��ġ
	for (int i = 0; i < priorities.size(); i++) {
		p.push(priorities[i]);
		q.push(make_pair(priorities[i], i));
	}
	while (q.size() != 0) {//��� ������ ����Ʈ�ɶ����� �ݺ�
		if (q.front().first == p.top()) {//�μ� ������� ������ �߿䵵�� ���� ������
			answer++;//�μ�� ������ �� ����
			p.pop();//���� �߿䵵�� ���� ���� ����
			if (q.front().second == location) {//�μ��û�� ������ ��ġ�� ��ġ�ϸ�
				break;//�ݺ��� ����
			}
		}
		else {//�� ���� �߿䵵�� ���� ������ �����ϸ�
			q.push(q.front());//�� �ڿ� �ٽ� ���
		}
		q.pop();//�� ���� ������� ����
	}
	return answer;
}
int main() {
	vector<int> priorities = { 2, 1, 3, 2};
	int location = 2;
	cout << solution(priorities, location);
}