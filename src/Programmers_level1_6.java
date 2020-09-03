import java.util.*;
public class Programmers_level1_6 {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> lostList = new ArrayList<Integer>();
        for(int lo:lost) {
        	if(!Arrays.stream(reserve).anyMatch(r->r == lo)){
        		lostList.add(lo);
        	}
        }
        for(int r:reserve) {
        	if(!Arrays.stream(lost).anyMatch(l->l == r)) {
        		list.add(r);
        	}
        }
        for(int li:list) {
        	if(lostList.contains(li+1)) {
        		answer++;
        		lostList.remove(lostList.indexOf(li+1));
        		continue;
        	}
        	if(lostList.contains(li-1)) {
        		answer++;
        		lostList.remove(lostList.indexOf(li-1));
        		continue;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int n=5;
		int[] lost = {2, 4, 5};
		int[] reserve = {1, 2, 3};
		System.out.println(solution(n, lost, reserve));
	}
}
