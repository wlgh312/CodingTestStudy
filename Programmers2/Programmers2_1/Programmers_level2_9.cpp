/*
ªÔ∞¢ ¥ﬁ∆ÿ¿Ã
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n) {
	vector<int> answer;
	vector<vector<int>> p(n, vector<int>(n));
	int a = -1;
	int b = 0;
	int limit = n;
	int cnt = 1;
	for (int i = 1; i <= n; i++) {
		for (int j = limit; j >= 1; j--) {
			if (i % 3 == 1) {
				p[++a][b]=cnt;
			}
			else if (i % 3 == 2) {
				p[a][++b]=cnt;
			}
			else if (i % 3 == 0) {
				p[--a][--b]=cnt;
			}
			cnt++;
		}
		limit--;
	}
	for(int i=0; i<n; i++){
		for (int j = 0; j < i+1; j++) {
			answer.push_back(p[i][j]);
		}
	}
	return answer;
}
int main() {
	int n = 4;
	for (int s : solution(n)) {
		cout << s<<" ";
	}
}