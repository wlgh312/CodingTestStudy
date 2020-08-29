/*
 완주하지 못한 선수
 */
import java.util.*;

public class Programmers_level1_3 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
        HashMap<String, Integer> par = new HashMap<String, Integer>();//해시맵
        for(String s:participant){//참가자
            if(!par.containsKey(s)){//해시맵에 s참가자가 포함되어있지않다면
                par.put(s, 1);//해시맵에 추가
            }
            else//해시맵에 s참가자가 포함되어있다면
                par.put(s, par.get(s)+1);//해시맵에 s참가자의 value값(인원수) 증가
        }
        for(String c:completion){//완주자
            if(par.containsKey(c)) {//참가자 해시맵에 c완주자가 포함되어있을때
            	if(par.get(c)==1)//동명이인이 없다면
            		par.remove(c);//c참가자 이름 삭제
            	else if(par.get(c)>1)//동명이인이 있다면
            		par.put(c, par.get(c)-1);//c이름을 가진 참가자의 인원수 감소
            }
        }
        for(String k:par.keySet()) {//비완주자만 남은 해시맵
        	answer=k;//비완주자 저장
        }
        return answer;
    }
	public static void main(String[] args) {
		String participant[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String completion[] = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(participant, completion));
	}
}
