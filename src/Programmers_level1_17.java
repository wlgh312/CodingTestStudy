/*
수박수박수박수박수박수?
 */
public class Programmers_level1_17 {
	public static String solution(int n) {
		String answer = "";
		for(int i=1; i<=n; i++) {//1부터 n까지(문자열 크기) 반복
			if(i%2!=0) {//홀수번째 문자일 떄
				answer+="수";//문자열에 "수"추가
			}
			else {//짝수번재 문자일 때
				answer+="박";//문자열에 "박"추가
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
		}
}

