/*
평균 구하기
 */
public class Programmers_level1_33 {
	public static double solution(int[] arr) {
		double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];//배열 모든 원소의 합
        }
        answer = answer/arr.length;//평균 계산
        return answer;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));
	}
}
