/*
체육복
 */
public class Programmers_level1_6 {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer=0;
        int stu[] = new int[n];//모든 학생들의 체육복 개수를 나타낸 배열
        for(int l : lost) {
        	stu[l-1]--;
        }
        for(int r : reserve) {
        	stu[r-1]++;
        }
        for(int i=0; i<n; i++) {
        	if(stu[i]<0) {//체육복이 없는 경우
        		if(i>0 && stu[i-1]>0) {//첫번째 학생을 제외하고 전 번호의 학생이 여벌의 체육복을 가지고 있다면
        			stu[i]++;
        			stu[i-1]--;
        		}
        		else if(i<n-1 && stu[i+1]>0) {//마지막 학생을 제외하고 다음 번호의 학생이 여벌의 체육복을 가지고 있다면
        			stu[i]++;
        			stu[i+1]--;
        		}
        	}
        }
        for(int s : stu) {
        	if(s>=0)//체육복을 가지고 있다면
        		answer++;//수업가능한 학생 증가
        }
        return answer;
    }
	public static void main(String[] args) {
		int n=5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(solution(n, lost, reserve));
	}
}
