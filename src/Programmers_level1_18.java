/*
문자열을 정수로 바꾸기
 */
public class Programmers_level1_18 {
	public static int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);//문자의 정수 변환
		return answer;
	}
	public static void main(String[] args) {
		String s = "-1234";
		System.out.println(solution(s));
		}
}
