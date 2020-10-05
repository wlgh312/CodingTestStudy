/*
짝수와 홀수
 */
public class Programmers_level1_29 {
	public static String solution(int num) {
		String answer = "";
		answer = num % 2 == 0? "Even":"Odd";//삼항연산자
		return answer;
	}
	public static void main(String[] args) {
		int num = 4;
		System.out.println(solution(num));
	}
}
