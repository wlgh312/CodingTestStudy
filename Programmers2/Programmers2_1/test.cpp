#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main() {
	int N;
	int M;
	int E;
	int vec;
	int a, b;
	int c = 0;
	int res = 0;
	cin >> N >> M >> E;
	vector<int> v(N);
	for (int i = 0; i < N; i++) {
		cin >> v[i];
	}
	for (int i = 0; i < M; i++) {
		for (int j = 0; j < v.size(); j++) {
			if (N > abs(E - v[j])) {
				if (v[j] < E) {
					a = v[j];
					c = j;
				}
				else if (v[j] > E) {
					b = v[j];
					c = j;
				}
			}
		}
		v.erase(v.begin()+c);
	}
	res = b - a;
	cout << res;
	return 0;
}