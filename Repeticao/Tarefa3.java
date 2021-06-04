package Repeticao;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int age, cont21=0, cont50=0, baseage = -99;
		
		System.out.println("\nInsert Your Age: ");
		age = read.nextInt();
		
		while(age != -99 ) {
			if(age>=0 && age <=21) {
				cont21++;
			}
			if(age > 50) {
					cont50++;
			}
			System.out.println("\nInsert Your Age: ");
			age = read.nextInt();
			}
			System.out.println("\nTotal people with less than 21 Years: "+cont21);
			System.out.println("\nTotal people with more than 50 Years: "+cont50);
	}
}


