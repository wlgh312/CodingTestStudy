/*
하샤드 수
 */
public class Programmger_level1_34 {
	public static boolean solution(int x) {
        boolean answer = true;
        int num=x;//자릿수와 몫을 계산하기 위한 변수
        int sum=0;//모든 자릿수의 합
        while(num>0){//몫이 존재하면 반복
            sum+=(num%10);//각 자릿수값 더하기
            num/=10;//더한 자리수값 제외
        }
        answer = x%sum==0?true:false;//하샤드 수 확인
        return answer;
    }
	public static void main(String[] args) {
		int x = 11;
		System.out.println(solution(x));
	}
}
