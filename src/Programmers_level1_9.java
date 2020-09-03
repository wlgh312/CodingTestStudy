/*
 같은 숫자는 싫어
 */
import java.util.*;
public class Programmers_level1_9 {
	public static int[] solution(int[] arr) {
		int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);//리스트에 배열의 첫 원소를 저장
        for(int i=0; i<arr.length-1; i++){//배열의 각 원소와 다음 인덱스의 원소를 비교해야 되므로 배열의 크기보다 1작은 크기만큼 반복
            if(arr[i]!=arr[i+1])//배열의 i번째 원소와 다음 원소가 다르면
                list.add(arr[i+1]);//리스트에 다음 원소 추가
        }
        answer = new int[list.size()];//리스트의 크기와 같은 배열 재생성
        for(int i=0; i<list.size(); i++){//리스트의 모든 원소를
            answer[i]=list.get(i);//배열에 저장
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		for(int i=0;i<solution(arr).length; i++)
			System.out.println(solution(arr)[i]);
	}
}
