/*
 k번째 수
 */
import java.util.*;
public class Programmers_level1_5 {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();//배열을 잘라서 저장할 리스트
        answer = new int[commands.length];//배열 크기 조정
        for(int j=0; j<commands.length; j++){//뽑아낼 숫자의 수만큼 반복
            for(int i=commands[j][0]-1; i<=commands[j][1]-1; i++){//i부터 j까지 배열 자르기
                list.add(array[i]);//잘라낸 수를 리스트에 저장
            }
            Collections.sort(list);//리스트 정렬
            answer[j] = list.get(commands[j][2]-1);//잘라낸 리스트에서 k번째 숫자를 배열에 저장
            list.clear();//다음 잘라낸 배열을 저장하기 위해 리스트 초기화
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int s : solution(array, commands)) {
			System.out.println(s);
		}
	}
}
