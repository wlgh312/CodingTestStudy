/*
정수 제곱근 판별
 */
public class Programmers_level1_27 {
	public static long solution(long n) {
		long answer = 0;
		double s = Math.sqrt(n);//제곱근
		double sq = s - (int)s;//소수점 이하
		if(sq==0)//제곱근이 존재하면
			answer = (long)Math.pow(s+1, 2);//n+1의 제곱
		else if(sq!=0)//제곱근이 존재하지 않으면
			answer = -1;
		return answer;
	}
	public static void main(String[] args) {
		long n = 121;
		System.out.println(solution(n));
	}
}
