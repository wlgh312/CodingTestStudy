/*
소수 찾기
 */
//에라토스테네스의 체
public class Programmers_level1_16 {
	public static int solution(int n) {
		int answer = 0;
		boolean[] prime = new boolean[n+1];//소수인지 아닌지 확인하기 위한 부울형 배열(인덱스값과 숫자가 같이 취급하기 위해 n+1크기로 생성)
		for(int i=2; i<=n; i++)//1은 소수가 아님
			prime[i]=true;//배열의 모든 수를 소수라는 뜻의 true로 지정
		int sq = (int)Math.sqrt(n);//시간 단축을 위한 제곱근
		for(int i=2; i<=sq; i++) {
			if(prime[i]==true) {//i가 소수면
				for(int j=i; i*j<=n; j++)//n까지 i(소수 중 하나)의 배수 확인
					prime[i*j]=false;//소수의 배수는 소수가 아님
			}
		}
		for(int i=2; i<=n; i++) {//배열의 모든 값 확인
			if(prime[i]==true)//i가 소수면
				answer++;//결과값 증가
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
}
