package Exercicios;

import java.util.Scanner;


public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double age,mouths,days,totaldays;	
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu nome: ");
		name = read.next();
		System.out.println("\nEntre com a quantidade de anos: ");
		age = read.nextFloat();
		System.out.println("\nEntre com a quantidade de meses: ");
		mouths = read.nextFloat();
		System.out.println("\nEntre com a quantidade de dias: "); 
		days = read.nextFloat();	
			
		totaldays = age*365 + mouths*30 + days;
		
		System.out.println("\nOla "+name+", você viveu tudo isso "+totaldays+" Days");
		System.out.printf("\nOla %s, você viveu tudo isso ",name, totaldays);
	}
}
