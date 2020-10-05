/*
제일 작은 수 제거하기
 */
import java.util.*;
public class Programmers_level1_28 {
	public static int[] solution(int[] arr) {
		int[] answer = {-1};//정수가 하나만 포함되어 있을 때를 위한 배열 초기화
		ArrayList<Integer> list = new ArrayList<Integer>();//작은 수 제거를 위한 리스트 생성
		int tmp = arr[0];//제일 작은 수를 저장하기 위한 변수
		int cnt = 0;//제일 작은 수가 저장되어 있는 배열의 인덱스
		list.add(arr[0]);//배열의 첫번째 수를 리스트에 저장
		for(int i=1; i<arr.length; i++) {//배열 반복
			list.add(arr[i]);//리스트에 배열의 i번째 원소 저장
			if(tmp>arr[i]) {//임시 변수에 저장된 값보다 i번째 원소가 작으면
				tmp = arr[i];//임시변수에 더 작은 수 저장
				cnt = i;//작은 수의 인덱스 저장
			}
		}
		list.remove(cnt);//리스트에서 제일 작은 수의 인덱스로 원소 삭제
		if(list.size()!=0) {//리스트가 비어있지 않다면(배열의 원소가 두개 이상이면)
			answer = new int[arr.length-1];//제일 작은 수를 제외한 배열의 크기만큼 배열 생성
			for(int i = 0; i<list.size(); i++) {//리스트를 배열로 변환
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {10, 3, 5, 4};
		for(int i=0; i<solution(arr).length; i++)
			System.out.println(solution(arr)[i]);
	}
}
