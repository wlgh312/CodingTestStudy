/*
자연수 뒤집어 배열로 만들기
 */
public class Programmers_level1_24 {
	public static int[] solution(long n) {
		int[] answer = {};
		int num=(int)Math.log10(n)+1;//정수 n의 자리수
		answer = new int[num];//자리수 크기의 배열 선언
		for(int i=0; i<num; i++) {
			answer[i]=(int)(n%10);//배열에 일의 자리 수 부터 순서대로 저장
			n=n/10;//저장된 수는 없애기
		}
		return answer;
	}
	public static void main(String[] args) {
		long n=12345;
		for(int i=0; i<5; i++) {
			System.out.println(solution(n)[i]);
		}
	}
}
