package LaçoDecisão; //UNDONE

import java.util.Scanner;
public class Tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		double res;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nInsert a number: ");
		num = read.nextInt();
		
		if(num % 2 == 0 ) {
			res = Math.sqrt(num);
		}
		else {
			res = Math.pow(num, 2);
		}
		System.out.println("\nThe result is: "+res);
	}
}
