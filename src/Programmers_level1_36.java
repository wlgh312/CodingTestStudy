/*
실패율
 */
import java.util.*;

public class Programmers_level1_36 {
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		HashMap<Integer, Double> valSort = new HashMap<Integer, Double>();//스테이지 정렬을 위해 맵 사용<스테이지 번호, 실패율>
		int non = 0;//도달한 플레이어 수(클리어x)
		int clear = 0;//해당 스테이지에 도달한 플레이어 수
		double nc = 0;//실패율
		for(int i=1; i<=N; i++) {//스테이지 수 만큼 반복
			for(int s: stages) {//플레이어가 도달한 스테이지
				if(s==i) {//플레이어가 i번째 스테이지에 도전 중이면
					non++;
				}
				if(s>=i) {//플레이어가 i번째 스테이지에 도달했었으면
					clear++;
				}
			}
			if(clear==0) {//i번째 스테이지에 도달한 사람이 아무도 없으면
				nc = 0.0;//실패율은 0
			}
			else {
				nc = (double)non/(double)clear;//실패율 저장
			}
			valSort.put(i, nc);//맵에 스테이지 번호와 실패율 저장
			non=0;
			clear=0;
		}
		ArrayList<Integer> list = new ArrayList<>(valSort.keySet());//정렬을 위한 리스트 생성
		Collections.sort(list, (o1, o2) -> (valSort.get(o2).compareTo(valSort.get(o1))));//value를 기준으로 리스트 정렬
		for(int i=0; i<N; i++) {
			answer[i]=list.get(i);//정렬 된 스테이지 번호
		}
		return answer;
	}
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 4, 2, 4, 3, 3};
		for(int i=0; i<N; i++) {
			System.out.println(solution(N, stages)[i]);
		}
	}
}
