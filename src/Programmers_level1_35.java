/*
핸드폰 번호 가리기
 */
public class Programmers_level1_35 {
	public static String solution(String phone_number) {
		String answer="";
		int l=phone_number.length();//번호 길이
		for(int i=0; i<l-4; i++) {//4자리를 뺀 나머지 수만큼 *입력
			answer+="*";
		}
		answer+=phone_number.substring(l-4, l);//4자리 번호 입력
		return answer;
	}
	public static void main(String[] args) {
		String phone_number="01033334444";
		System.out.println(solution(phone_number));
	}
}
