/*
직사각형 별찍기
 */
import java.util.*;
public class Programmers_level1_39 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i <b;i++){
            for(int j=1;j<a;j++){
                System.out.print("*");
            }   
        System.out.println("*");
        }
	}
}
