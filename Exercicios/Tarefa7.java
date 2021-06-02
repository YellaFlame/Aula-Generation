package Exercicios;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		double a, b, c, d, ee, f, x, y;
		
		System.out.println("\nEnter with value of A: ");
		a = read.nextDouble();
		System.out.println("\nEnter with value of B: ");
		b = read.nextDouble();
		System.out.println("\nEnter with value of C: ");
		c = read.nextDouble();
		System.out.println("\nEnter with value of D: ");
		d = read.nextDouble();
		System.out.println("\nEnter with value of E: ");
		ee = read.nextDouble();
		System.out.println("\nEnter with value of F: ");
		f = read.nextDouble();
		
		x = (c*ee - b*f)/(a*ee- b*d);
		y = (a*f - c*d)/(a*ee - b*d);
		
		System.out.println("\nThe value of X is: "+x);
		System.out.println("\nThe Value of Y is: "+y);				
	}
}
