import java.util.*;

public class Programmers_level1_40 {
	public static int[] solution(int[] numbers) {
		int[] answer= {};
		int n=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				n = numbers[i]+numbers[j];
				if(!list.contains(n)) {
					list.add(n);
				}
			}
		}
		Collections.sort(list);
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		for(int i=0; i<solution(numbers).length; i++) {
			System.out.println(solution(numbers)[i]);
		}
	}

}
