#include <iostream>
#include <string>
#include <vector>

using namespace std;
int solution(string s) {
	int answer=s.length();
	int tmp, cnt=1;
	string str;
	for (int i = 1; i <= s.length()/2; i++) {
		str = "";
		tmp = 0;
		for (int j = 1; j <= (s.length() / i); j++) {
			if (!s.substr(tmp, i).compare(s.substr(tmp + i, i))) {
				cnt++;//동일한 문자열의 갯수
			}
			else {
				if (cnt == 1) {
					str += s.substr(tmp, i);
				}
				else {
					str += to_string(cnt) + s.substr(tmp, i);
				}
				cnt = 1;
			}
			tmp += i;
		}
		if (str.length() + (s.length() % i) < answer) {
			answer = str.length() + (s.length() % i);
		}
	}
	return answer;
}
int main() {
	string s = "aabbaccc";
	cout << solution(s);
}