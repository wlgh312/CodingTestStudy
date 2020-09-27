/*
예산
 */
import java.util.*;

public class Programmers_level1_26 {
	public static int solution(int[] d, int budget) {
		int answer=0;
		Arrays.sort(d);//최대부서에 나눠주기 위한 배열 정렬
		for(int i=0; i<d.length; i++) {
			if(budget<d[i]) {//i번째 부서의 신청금액이 남은 예산보다 많으면
				answer=i;//그 전 부서까지만 answer에 저장
				break;//반복문 종료
			}
			if(i==d.length-1 && budget>=d[i]) {//마지막 부서이고 남은 예산이 마지막 부서의 신청 예산보다 많으면
				answer=i+1;//모든 부서의 수 answer에 저장
			}
			budget-=d[i];//나눠준 예산은 남은 예산에서 삭감
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] d = {2, 2, 3, 3};
		int budget = 10;
		System.out.println(solution(d, budget));
	}
}
