/*
2016년
 */
public class Programmers_level1_7 {
	public static String solution(int a, int b) {
		String answer = "";
		int week = 0;
		int sum = 4;//날짜 계산을 위한 금요일-1
		for(int i=1; i<=12; i++) {
			if(a!=i) {
				if(i == 2) {//윤년
					sum+=29;
				}
				else if((i<=7 && i%2!=0) || (i>7 && i%2==0)) {//일수가 31일인 달
						sum+=31;
				}
				else if((i<=7 && i%2==0) || (i>7 && i%2!=0)) {//일수가 30일인 달
						sum+=30;
				}
			}
			else if(a==i) {//해당 월일 경우
				sum+=b;
				break;
			}
		}
		week = sum%7;
		switch(week) {
		case 0:
			answer = "SUN";
			break;
		case 1:
			answer = "MON";
			break;
		case 2:
			answer = "TUE";
			break;
		case 3:
			answer = "WED";
			break;
		case 4:
			answer = "THU";
			break;
		case 5:
			answer = "FRI";
			break;
		case 6:
			answer = "SAT";
			break;
		}
		return answer;
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
	}
}
