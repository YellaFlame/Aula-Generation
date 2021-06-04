package Repeticao;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		float num=0, contodd=0, contpair=0;
		
		for(int x=0;x<=9;x++) {
			if( num % 2 == 0) {
				contpair++;
			}
			else {
				contodd++;
			}
			System.out.println("\nInsert a number: ");
			num = read.nextFloat();
		}
		
		System.out.println("\nPair: "+contpair);
		System.out.println("\nOdd: "+contodd);
		System.out.println("\nThere are "+contodd+" Odd numbers and "+contpair+" Pair numbers.");
	}
}
