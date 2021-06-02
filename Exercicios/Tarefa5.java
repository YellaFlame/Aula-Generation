package Exercicios;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double n1, n2, n3, p1=2.0, p2=3.0, p3=5.0, average, mp;
		Scanner read = new Scanner(System.in);
			
		System.out.println("\nInsert the Name: ");
		name = read.next();
		System.out.println("\nInsert the Note N1: ");
		n1 = read.nextFloat();
		System.out.println("\nInsert the Note N2: ");
		n2 = read.nextFloat();
		System.out.println("\nInsert the Note N3: ");
		n3 = read.nextFloat();
		
		n1 = (n1*p1);
		n2 = (n2*p2);
		n3 = (n3*p3);
		mp = (p1+p2+p3);
		average = (n1+n2+n3)/ mp;
		
		System.out.println("\nYour final average is: "+average);
		
	}

}
