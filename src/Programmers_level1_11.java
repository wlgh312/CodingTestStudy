/*
두 정수 사이의 합
 */
public class Programmers_level1_11 {
	public static long solution(int a, int b) {
        long answer = 0;
        int tmp=0;
        if(a>b){//작은 수 큰 수 정렬
            tmp=a;
            a=b;
            b=tmp;
        }
        for(int i=a; i<=b; i++){//정수 사이의 합 계산
            answer+=i;
        }
        return answer;
    }
	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(solution(a, b));
	}
}
