/*
서울에서 김서방 찾기
 */
public class Programmers_level1_15 {
	public static String solution(String[] seoul) {
		String answer = "";
		for(int i=0; i<seoul.length; i++) {//문자열 배열의 크기만큼 반복
			if(seoul[i].equals("Kim"))//배열의 i번째 문자열이 Kim이면
				answer="김서방은 "+i+"에 있다";//결과 저장
		}
		return answer;
	}
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
			System.out.println(solution(seoul));
		}
}
