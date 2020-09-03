/*
 문자열 내 마음대로 정렬하기
 */
import java.util.*;
public class Programmers_level1_12 {
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<String>();//지정된 인덱스의 문자를 문자열의 앞쪽에 추가하기 위한 리스트
        for(String s:strings) {
        	list.add(s.substring(n, n+1)+s);//지정된 인덱스의 문자를 문자열의 앞에 합해서 리스트에 저장
        }
        Collections.sort(list);//사전순을 위한 리스트 정렬
        answer = new String[list.size()];//리스트의 크기에 맞춘 배열 재생성
        for(int i=0; i<strings.length; i++) {
        	answer[i] = list.get(i).substring(1);//맨 앞의 문자를 제외한 문자열을 배열에 저장
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] strings= {"sun", "bed", "car"};
		int n=1;
		for(int i=0; i<strings.length; i++) {
			System.out.println(solution(strings, n)[i]);
		}
	}
}
