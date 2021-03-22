/*
큰 수 만들기
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;

string solution(string number, int k) {
	string answer;
	int Idx;//최대값의 인덱스
	int max;//최대값
	int maxIdx=0;//다음 큰 수를 찾기위한 최대값의 다음 인덱스
	for (int i = number.length()-k; i > 0; i--) {//입력할 수의 갯수만큼만 반복
		max = 0;//최대값 초기화
		for (int j = maxIdx; j <= number.length()-i; j++) {//이전 큰 수의 다음 인덱스부터 입력할 수 있는 최대한의 수까지만 확인
			//6글자를 입력해야되면 뒤에 적어도 5글자를 남기고 앞에 글자 확인해야함
			if (max < number[j]) {//저장된 값보다 j번째 수가 더 크면
				max = number[j];
				Idx = j;
			}
		}
		maxIdx = Idx+1;//다음 큰 수를 찾기 위한 인덱스 이동
		answer += max;
	}
	return answer;
}
int main() {
	string number = "1231234";
	int k = 3;
	cout << solution(number, k);
}