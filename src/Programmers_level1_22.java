/*
이상한 문자 만들기
 */
public class Programmers_level1_22 {
	public static String solution(String s) {
		String answer="";
		int cnt=0;//한 단어의 인덱스
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {//공백이면
				answer+=s.charAt(i);//그대로 공백 저장
				cnt=0;//단어의 인덱스를 나타내는 변수 초기화
				continue;
			}
			if(cnt%2==0)//짝수번째 문자면
				answer+=s.substring(i, i+1).toUpperCase();//대문자로 변환
			else if(cnt%2!=0)//홀수번째 문자면
				answer+=s.substring(i, i+1).toLowerCase();//소문자로 변환
			cnt++;//단어 내의 문자의 인덱스 증가
		}
		return answer;
	}
	public static void main(String[] args) {
		String s="try hello world";
		System.out.println(solution(s));
	}
}
