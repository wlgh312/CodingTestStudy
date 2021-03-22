/*
124나라의 숫자
*/
#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(int n) {
	string answer = "";
	string numbers[] = { "4", "1", "2" };
	int num = n;
	int remainder;
	while(num!=0) {
		remainder = num % 3;
		num = num / 3;
		if (remainder == 0)
			num -= 1;
		answer = numbers[remainder] + answer;
	}
	return answer;
}
int main() {
	int n = 4;
	cout << solution(n);
}