/*
시저 암호
 */
public class Programmers_level1_19 {
	public static String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {//문자열의 길이만큼 반복
        	int ch=(int)s.charAt(i);//문자열의 i번째 문자를 정수형(아스키 코드)으로 변환
        	if(ch==32) {//공백이면
        		answer+=" ";
        		continue;
        	}
        	if(ch<=90) {//문자가 대문자일 경우
        		if(ch+n>=91)//Z이상일 때
        			ch-=26;
        	}
        	else if(ch+n>=123)//소문자의 범위를 벗어났을 경우
        		ch-=26;
        	answer = answer+((char)(ch+n));//아스키 코드를 문자형으로 바꿔 결과에 저장
        }
		return answer;
	}
	public static void main(String[] args) {
		String s = "a B z ";
		int n = 25;
		System.out.println(solution(s, n));
		}
}
