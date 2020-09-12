/*
문자열 다루기 기본
 */
public class Programmers_level1_14 {
	public static boolean solution(String s) {
		boolean answer = true;
		if(s.length()==4 || s.length()==6) {//문자열의 길이가 4또는 6일 때
			if(s.matches(".*[a-z].*") == true)//문자열이 포함되어있으면
				answer=false;
		}
		else//문자열의 길이가 4또는 6이 아니면
			answer=false;
		return answer;
	}
	public static void main(String[] args) {
		String s="123";
			System.out.println(solution(s));
	}
}
