/*
ū �� �����
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;

string solution(string number, int k) {
	string answer;
	int Idx;//�ִ밪�� �ε���
	int max;//�ִ밪
	int maxIdx=0;//���� ū ���� ã������ �ִ밪�� ���� �ε���
	for (int i = number.length()-k; i > 0; i--) {//�Է��� ���� ������ŭ�� �ݺ�
		max = 0;//�ִ밪 �ʱ�ȭ
		for (int j = maxIdx; j <= number.length()-i; j++) {//���� ū ���� ���� �ε������� �Է��� �� �ִ� �ִ����� �������� Ȯ��
			//6���ڸ� �Է��ؾߵǸ� �ڿ� ��� 5���ڸ� ����� �տ� ���� Ȯ���ؾ���
			if (max < number[j]) {//����� ������ j��° ���� �� ũ��
				max = number[j];
				Idx = j;
			}
		}
		maxIdx = Idx+1;//���� ū ���� ã�� ���� �ε��� �̵�
		answer += max;
	}
	return answer;
}
int main() {
	string number = "1231234";
	int k = 3;
	cout << solution(number, k);
}