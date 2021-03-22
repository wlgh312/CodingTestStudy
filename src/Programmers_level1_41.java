import java.lang.Math;
public class Programmers_level1_41 {
	public static int solution(String dartResult) {
		int answer = 0;
		int a = 0;//이전 점수
		int b = 0;//해당 점수
		int cnt=0;
		int bc;
		char c;
		for(int i=0; i<dartResult.length(); i++) {
			c = dartResult.charAt(i);
			if(Character.isAlphabetic(c)) {
				cnt++;
				bc = Character.getNumericValue(dartResult.charAt(i-1));
				if(bc==0 && i!=1 && dartResult.charAt(i-2)=='1')
					bc=10;
				if(c=='S')
					b=bc;
				else if(c=='D')
					b=(int)Math.pow(bc, 2);
				else if(c=='T')
					b=(int)Math.pow(bc, 3);
			}
			else {
				if(c=='*') {
					a*=2;
					b*=2;
				}
				else if(c=='#') {
					b=-b;
				}
				else {
					if(cnt==2 && dartResult.charAt(i-1)!='1')
						answer+=a;
					a=b;
				}
			}
			if(i==dartResult.length()-1) {
				answer+=a+b;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String dartResult = "0D2S#10S";
		System.out.println(solution(dartResult));
	}
}
