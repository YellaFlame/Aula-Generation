package Exercicios;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float age, amouth, adays, ageyears;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade em Dias: ");
		age = read.nextFloat();
		
		ageyears = (age/365);
		amouth = (age/30);
		adays = (age);
		
		System.out.println("\nSua idade em Anos é de: "+ageyears);
		System.out.printf("\nSua idade em Meses é de: ",amouth);
		System.out.println("\nSua idade em Dias é de: "+adays);

	}

}
