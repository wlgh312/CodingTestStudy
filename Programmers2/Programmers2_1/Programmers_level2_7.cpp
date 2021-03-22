#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(string skill, vector<string> skill_trees) {
	int answer=skill_trees.size();
	map<char, int> ch;
	for (int i = 0; i < skill.length(); i++) {
		ch[skill[i]] = i + 1;
	}
	for (string s : skill_trees) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (ch[s[i]] > count) {
				answer--;
				break;
			}
			else if (ch[s[i]] == count) {
				count++;
			}
		}
	}
	return answer;
}
int main() {
	string skill = "CBD";
	vector<string> skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
	cout<<solution(skill, skill_trees);
}