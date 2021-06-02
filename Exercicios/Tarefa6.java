package Exercicios;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		double x1, y1, x2, y2, d, x3, y3, xy;
		
		System.out.println("\nInsert the Value of Point x1 in the Plan: ");
		x1 = read.nextDouble();
		System.out.println("\nInsert the Value of Point y1 in the Plan: ");
		y1 = read.nextDouble();
		System.out.println("\nInsert the Value of Point x2 in the Plan: ");
		x2 = read.nextDouble();
		System.out.println("\nInsert the Value of Point y2 in the Plan: ");
		y2 = read.nextDouble();
		
		x3 = Math.pow(x2 - x1, 2.0);
		y3 = Math.pow(y2 - y1, 2.0);
		xy = (x3 + y3);
		
		d = Math.sqrt(xy);
		
		System.out.printf("\nThe distance between the Two Points is: %2.1f",d);
		
	}

}
