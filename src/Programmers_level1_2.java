/*
 문자열 내림차순
 */
import java.util.*;

public class Programmers_level1_2 {
	public static String solution(String s) {
        String answer="";
        String tmp[] = s.split("");//문자열 나누기
        Arrays.sort(tmp, Collections.reverseOrder());//문자열 내림차순으로 정렬
        for(String t : tmp) {//배열을 문자열로 변환
        	answer+=t;
        }
        return answer;
    }
	public static void main(String[] args) {
		String s ="Zbcdefg"; 
		System.out.println(solution(s));
	}
}
