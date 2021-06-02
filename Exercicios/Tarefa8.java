package Exercicios;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		double costf, consumer;
		
		System.out.println("\nEnter the value of vehicle: ");
		costf = read.nextDouble();
		
		consumer = costf + (costf * 0.73); 
		
		System.out.println("\nValue to Consumer: "+consumer);
	}

}
