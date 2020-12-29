
public class Programmgers_level1_32 {
	public static int solution(int num) {
		int answer;
		int cnt=0;
		long n=(long)num;//오버플로우 방지
        while(n!=1){//입력값이 1이 아니면 반복
            if(cnt==501){//500번 이상 반복했을 시
                break;//반복문 종료
            }
            if(n%2==0){//짝수일 때
                n=n/2;
                cnt++;
            }
            else if(n%2!=0){//홀수일 때
                n=(n*3)+1;
                cnt++;
            }
        }
        if(cnt==501)//500번 반복한 결과가 1이 아닐 경우
            answer=-1;
        else
            answer=cnt;
		return answer;
	}
	public static void main(String[] args) {
		int num=626331;
		System.out.println(solution(num));
	}

}
