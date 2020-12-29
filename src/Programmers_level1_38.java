/*
x만큼 간격이 있는 n개의 숫자
 */
public class Programmers_level1_38 {
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num=x;
        for(int i=0; i<n; i++){
            answer[i]=num;
            num+=x;
        }
        return answer;
    }
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		for(int i=0; i<n; i++) {
			System.out.println(solution(x, n)[i]);
		}
	}
}
