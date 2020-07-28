import java.util.*;

public class Programmers_level1_1 {
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> num = new Stack<>();
        for(int i=0; i<moves.length; i++){//크레인 이동
            for(int j=board[moves[i]-1].length-1; j>=0; j--){//크레인이 위치해 있는 격자 안의 인형 확인(배열의 마지막부터 확인)
                if(board[moves[i]-1][j]!=0){//인형이 있다면
                    if(!num.empty() && num.peek()==board[moves[i]-1][j]) {//스택이 비어있지 않고 마지막 원소가 동일한 인형이라면
                    	num.pop();//스택의 마지막 원소 삭제
                        answer+=2;//삭제된 인형의 개수 증가
                    }
                    else{//스택이 비어있거나 동일한 인형이 아니라면
                    	num.push(board[moves[i]-1][j]);//스택에 인형 추가
                    }
                    board[moves[i]-1][j]=0;//격자의 인형 제거
                    break;//해당 격자에서의 작업 종료
                }
             }
        }
        return answer;
    }
	public static void main(String[] args) {
		int arr[][]= {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int moves[] = {1, 5, 3, 5, 1, 2, 1, 4};
		System.out.println(solution(arr, moves));
	}
}
