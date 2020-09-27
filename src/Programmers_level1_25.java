/*
정수 내림차순으로 배치하기
 */
import java.util.*;

public class Programmers_level1_25 {
	public static long solution(long n) {
		long answer = 0;
		String s=""+n;//입력받은 수를 문자열로 변환
		char[] c = s.toCharArray();//문자열을 문자 배열로 변환
		Arrays.sort(c);//문자 배열 정렬
		s="";//결과를 저장하기 위한 문자열 초기화
		for(int i=c.length-1; i>=0; i--) {//큰 수부터 작은 수 순서로 문자열에 저장
			s+=c[i];
		}
		answer = Long.parseLong(s);//문자열을 long형으로 변환
		return answer;
	}
	public static void main(String[] args) {
		long n=118372;
		System.out.println(solution(n));
	}
}
