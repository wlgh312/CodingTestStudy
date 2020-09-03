/*
 문자열 내 p와 y의 개수
 */
public class Programmers_level1_13 {
	public static boolean solution(String s) {
        boolean answer = true;
        s=s.toLowerCase();//소문자로 변환
        int i=0;//인덱스
        int p=0;//p의 개수
        int y=0;//y의 개수
        while(true) {//s.equalsIgnoreCase("p")=>대소문자무시 문자비교 함수
        	if(s.indexOf("p", i)!=-1) {//i번째 문자와 p를 비교하여 같으면
        		p++;//p개수 증가
        		i=s.indexOf("p", i)+1;//다음 p검색을 위해 p의 다음 인덱스로 변경
        	}
        	else//p가 더 이상 없으면
        		break;//반복문 종료
        }
        i=0;//인덱스 초기화
        while(true) {//y검색
        	if(s.indexOf("y", i)!=-1) {
        		y++;
        		i=s.indexOf("y", i)+1;
        	}
        	else
        		break;
        }
        if(p!=y) {//p와 y의 개수가 다르면
        	answer=false;
        }
        return answer;
    }
	public static void main(String[] args) {
		String s="pPooyY";
		System.out.println(solution(s));
	}
}
