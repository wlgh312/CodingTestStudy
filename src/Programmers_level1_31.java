/*
최대공약수와 최소공배수
 */
public class Programmers_level1_31 {
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		int min = Math.min(n, m);//두 정수 중 작은 수
		for(int i=1; i<=min; i++) {//작은 수까지만 반복(공약수)
			if(n%i == 0 && m%i == 0)//두 수가 모두 나누어지는 수가 있다면
				answer[0]=i;//0번째 배열에 저장
		}
		for(int i=1; i<=n*m; i++) {//두 수를 곱한 값까지 반복
			if((answer[0]*i)%n==0 && (answer[0]*i)%m==0) {//최대공약수의 배수가 두 정수로 모두 나누어진다면
				answer[1] = answer[0]*i;//1번째 배열에 저장
				break;//최소공배수이기 때문에 반복문 종료
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		for(int i = 0; i<2; i++) {
			System.out.println(solution(n, m)[i]);
		}
	}
}
