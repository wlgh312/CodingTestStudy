/*
 나누어 떨어지는 숫자 배열
 */
import java.util.*;

public class Programmers_level1_10 {
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){//배열 확인
            if(arr[i]%divisor==0){//배열의 각 원소를 divisor로 나누어지면
                list.add(arr[i]);//리스트에 원소 추가
            }
        }
        if(list.size()==0)//리스트에 저장된 값이 없으면
            list.add(-1);//리스트에 -1 저장
        Collections.sort(list);//리스트를 오름차순 정렬
        answer = new int[list.size()];//리스트의 크기에 맞게 배열 재생성
        for(int i=0; i<list.size(); i++){//리스트의 모든 원소들을
            answer[i]=list.get(i);//배열에 추가
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		for(int i=0;i<solution(arr, divisor).length; i++)
			System.out.println(solution(arr, divisor)[i]);
	}
}
