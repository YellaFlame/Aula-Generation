package Repeticao;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		double contnum=0,n=0;
		
		do {
			contnum = contnum + n;
			System.out.println("\nEnter with a number: ");
			n = read.nextDouble();
		}
		while(n!=0);
		System.out.println("\nThe sum of insertednumbers is: "+contnum);
	}
}
