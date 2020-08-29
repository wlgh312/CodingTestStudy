/*
 크레인 인형뽑기 게임
 */
import java.util.*;

public class Programmers_level1_1 {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;//사라진 인형 수
        Stack<Integer> num = new Stack<Integer>();//스택
        for(Integer m : moves){//크레인 위치
        	int i=m-1;//크레인 위치를 배열의 인덱스에 맞게 변환
        	//board=격자의 가로줄로 이루어진 배열
            for(int j=0; j<board[i].length; j++){//격자의 가로 크기만큼 반복
            	if(board[j][i]!=0){//크레인이 첫번째 격자의 맨 위의 인형을 만난다면
                    if(!num.empty() && num.peek()==board[j][i]) {//스택이 비어있지않고 맨 위의 수가 크레인이 잡은 인형과 같다면
                    	num.pop();//스택의 맨 위의 수 삭제
                        answer+=2;//사라진 인형 수 2 증가
                    }
                    else{//스택이 비어있거나 맨 위의 수가 크레인이 잡은 인형과 다르다면
                    	num.push(board[j][i]);//스택에 인형 추가
                    }
                    board[j][i]=0;//크레인이 잡은 인형 자리 0으로 변경
                    break;//다음 크레인 위치로 이동하기 위해 반복문 종료
                }
             }
        }
        return answer;
    }
	public static void main(String[] args) {
		int arr[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[] = {1,5,3,5,1,2,1,4};
		System.out.println(solution(arr, moves));
	}
}
