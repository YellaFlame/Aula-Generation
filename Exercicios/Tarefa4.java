package Exercicios;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int a=0, b=0, c=0, d, r, s;
		
		System.out.println("Entre com um numero positivo para a variavel A: ");
		a = read.nextInt();
		System.out.println("Entre com um numero positivo para a variavel B: ");
		b = read.nextInt();
		System.out.println("Entre com um numero positivo para a variavel C: ");
		c = read.nextInt();
		
		s = (int) Math.pow(b+c,2); 
		r = (int) Math.pow(a+b,2);
		d = (r + s)/2;
		
		System.out.println("\nO resultado da equação R é: "+r);
		System.out.println("\nO resultado da equação S é: "+s);
		System.out.println("\nO resultado da equação D é: "+d);		
	}

}
