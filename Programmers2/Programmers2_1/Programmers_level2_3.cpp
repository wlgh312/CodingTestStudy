/*
������ �簢��
*/
#include <iostream>

using namespace std;

long long solution(int w, int h) {
	long long answer = 0;
	int m = 0;
	int a = w;
	int b = h;
	while (b != 0) {//�ִ�����(��Ŭ���� ȣ����)
		m = a % b;
		a = b;
		b = m;
	}
	answer = ((long long)w*(long long)h) - (w+h-a);
	return answer;
}

int main() {
	int w = 8;
	int h = 12;
	cout << solution(w, h);
}