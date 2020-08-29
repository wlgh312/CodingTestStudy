/*
 가운데 글자 가져오기
 */
public class Programmers_level1_8 {
	public static String solution(String s) {
        String answer="";
        if(s.length()%2==0){//문자열의 길이가 짝수이면
            answer = s.substring(s.length()/2-1, s.length()/2+1);//가운데 두 문자를 문자열로 저장
        }
        else if(s.length()%2!=0){//문자열의 길이가 홀수면
            answer = Character.toString(s.charAt(s.length()/2));//가운데 하나의 문자를 문자열로 변환하여 저장
        }
        return answer;
    }
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(solution(s));
	}
}
