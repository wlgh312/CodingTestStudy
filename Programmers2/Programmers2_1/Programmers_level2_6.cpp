#include <iostream>
#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
	int answer=bridge_length;
	int truck=0;
	queue<int> q;
	for (int i = 0; i < truck_weights.size(); i++) {
		while (true) {
			if (q.size() != bridge_length) {
				if (truck + truck_weights[i] <= weight) {
					q.push(truck_weights[i]);
					truck += truck_weights[i];
					if (i == truck_weights.size() - 1) {
						answer += q.size();
					}
					break;
				}
				else
					q.push(0);
			}
			else {
				truck -= q.front();
				q.pop();
				answer++;
			}
		}
	}
	return answer;
}
int main() {
	int bridge_length = 2;
	int weight = 10;
	vector<int> truck_weights = { 7, 4, 5, 6 };
	cout << solution(bridge_length, weight, truck_weights);
}