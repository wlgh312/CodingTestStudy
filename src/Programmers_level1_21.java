/*
[1차]비밀지도
 */
public class Programmers_level1_21 {
	 public static String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        String b;
	        for(int i=0; i<n; i++) {
	        	b = Integer.toBinaryString(arr1[i]|arr2[i]);//각 배열의 i번째 수들의 OR연산 계산 후 이진수로 변환
	        	b = String.format("%"+n+"s", b);//이진수의 길이를 입력받은 수만큼의 크기로 지정
	        	b = b.replace('1', '#');//1을 #으로
	        	b = b.replace('0', ' ');//0을 공백으로 변환
	        	answer[i] = b;//결과 배열에 i번째 변환 결과 저장
	        }
	        return answer;
	 }
	 public static void main(String[] args) {
			int n = 6;
			int[] arr1 = {46, 33, 33 ,22, 31, 50};
			int[] arr2 = {27 ,56, 19, 14, 14, 10};
			for(int i=0; i<n; i++)
				System.out.println(solution(n, arr1, arr2)[i]);
		}
}
