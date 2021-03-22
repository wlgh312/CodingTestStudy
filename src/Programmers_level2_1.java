import java.util.*;
public class Programmers_level2_1 {
	public static String solution(int n) {
		String answer="";
		int[] num = {1, 2, 4};
		int cnt = 1;
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(cnt<=3) {
					map.put(cnt, Integer.toString(num[j]));
					cnt++;
				}
				else if(cnt>0) {
					map.put(cnt, Integer.toString(num[i])+Integer.toString(num[j]));
					cnt++;
				}
			}
			if(cnt==10)
				break;
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}

}
