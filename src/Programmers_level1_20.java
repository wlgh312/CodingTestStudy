/*
약수의 합
 */
public class Programmers_level1_20 {
	public static int solution(int n) {
	    int answer = 0;
	    for(int i=1; i<=(n/2); i++) {//정수의 절반까지만 반복
	    	if(n%i==0) {//약수 구하기
	    		answer+=i;
	    	}
	    }
	    answer+=n;//약수의 합에 정수 자신의 값 더하기
		return answer;
	}
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
}
