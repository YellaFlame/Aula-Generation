package Array;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		int A[] = { 0, 0, 0, 0, 0, 0};
		int sum;
		
		A[0] = 1; A[1] = 0; A[2] = 5; A[3] = -2; A[4] = -5; A[5] = 7;
		
		System.out.println("\n_______________");
		sum = A[0] + A[1] + A[5];
		System.out.println("\nSum of positions A[0], A[1] and A[5]: "+sum);
		
		System.out.println("\n_______________");
		System.out.println("\nThe value of Position 4 has changed to 100");
		A[4] = 100;
		System.out.println("\n_______________");
		
		System.out.println("\n-----Vector A values-----\nA[0]: "+A[0]+"\nA[1]: "+A[1]+"\nA[3]: "+A[3]+
				"\nA[4]: "+A[4]+"\nA[5]: "+A[5]);
		
		
	}
	

}
