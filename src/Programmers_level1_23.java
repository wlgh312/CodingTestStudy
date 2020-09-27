/*
자릿수 더하기
 */
public class Programmers_level1_23 {
	public static int solution(int n) {
		int answer = 0;
        do{
            answer+=(n%10);//일의 자리 수 부터 순서대로 answer에 더하기
            n=(n/10);//사용한 수는 없애기
        }while(n>0);//남은 수가 있으면 반복
        return answer;
	}
	public static void main(String [] args) {
		int n=987;
		System.out.println(solution(n));
	}
	
}
