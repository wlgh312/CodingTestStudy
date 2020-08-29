/*
 모의고사
 */
import java.util.*;
public class Programmers_level1_4 {
	public static int[] solution(int[] answers) {
		int[] answer = {};
        int max;//결과를 위한 임시 최대값 변수
        //맞춘 정답 수 비교
        int cnt1=0;//첫번째 수포자가 맞춘 정답 수
        int cnt2=0;
        int cnt3=0;
        //규칙에 맞춰 반복되는 문제
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0; i<answers.length; i++){//문제 수만큼 반복
            if(s1[i%s1.length]==answers[i])//수포자1 정답확인
                cnt1++;//정답 수 증가
            if(s2[i%s2.length]==answers[i])//수포자2 정답확인
                cnt2++;
            if(s3[i%s3.length]==answers[i])//수포자3 정답확인
                cnt3++;
        }
        max = Math.max(cnt1, Math.max(cnt2, cnt3));//가장 많이 맞춘 정답 수
        ArrayList<Integer> list = new ArrayList<Integer>();//정답자를 추가하기위한 리스트 생성
        //최대 정답수와 같은 수만큼 문제를 맞춘 수포자를 리스트에 추가
        if(max==cnt1)
            list.add(1);
        if(max==cnt2)
            list.add(2);
        if(max==cnt3)
            list.add(3);
        answer = new int[list.size()];//배열은 크기를 변경할 수 없기 때문에 리스트의 크기와 같은 크기의 배열을 새로 생성
        for(int i=0; i<answer.length; i++){//제일 많이 맞춘 학생 수 만큼 반복
            answer[i]=list.get(i);//배열에 수포자 저장
        }
        return answer;
	}
	public static void main(String[] args) {
		int[] answers= {1, 2, 3, 4, 5};
		for(int s : solution(answers)) {
			System.out.println(s);
		}
	}
}
