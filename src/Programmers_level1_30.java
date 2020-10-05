
public class Programmers_level1_30 {
	public static String solution(int[] numbers, String hand) {
		String answer="";
		int left = 10;//왼손 처음 위치 "*"
		int right = 12;//오른손 처음 위치 "#"
		int ldis = 0;//왼손과 눌러야 될 키의 거리
		int rdis = 0;//오른손과 눌러야 될 키의 거리
		for(int i=0; i<numbers.length; i++) {//눌러야 될 수의 배열 반복
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {//왼쪽
				answer+="L";
				left = numbers[i];//왼손 위치 변경
			}
			else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {//오른쪽
				answer+="R";
				right = numbers[i];//오른손 위치 변경
			}
			else if(numbers[i]==2 || numbers[i]==8 || numbers[i]==5 || numbers[i]==0) {//중간
				if(numbers[i]==0)//거리 계산을 위해 키패드 0을 11로 변경
					numbers[i]=11;
				int[] leftIdx = {(left/3), ((left%3)-1)};//왼손이 누를 키패드를 이차배열의 인덱스로 변경
				int[] rightIdx = {(right-1)/3, ((right+2)%3)};//오른손이 누를 키패드를 이차배열의 인덱스로 변경
				int[] center = {(numbers[i]/3), 1};//가운데 숫자의 키패드를 이차배열의 인덱스로 변경
				ldis = Math.abs(center[0]-leftIdx[0])+Math.abs(center[1]-leftIdx[1]);//왼손과 눌러야 될 수의 거리
				rdis = Math.abs(center[0]-rightIdx[0])+Math.abs(center[1]-rightIdx[1]);//오른손과 눌러야 될 수의 거리
				if(ldis>rdis) {//왼손의 거리가 오른손의 거리보다 멀면
					answer+="R";
					right = numbers[i];//오른손 위치 변경
				}
				else if(ldis<rdis) {//오른손의 거리가 왼손의 거리보다 멀면
					answer+="L";
					left = numbers[i];//왼손 위치 변경
				}
				else {//두 손이 모두 같은 거리에 있으면
					if(hand.equals("right")) {//오른손잡이 일 때
						answer+="R";
						right = numbers[i];//오른손 위치 변경
					}
					else if(hand.equals("left")) {//왼손잡이 일 때
						answer+="L";
						left = numbers[i];//왼손 위치 변경
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}
}
