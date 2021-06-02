package Exercicios;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		double hours, minutes, seconds, time;
		
		System.out.println("\nEntre com o tempo de duração do evento em Segundos: " );
		time = read.nextFloat();
		
		hours = (time/3600);
		minutes = (time % 3600/ 60 );
		seconds = (time % 3600  % 60 );
		
		System.out.println("\nHoras: "+hours+" Minutos: "+minutes+" Segundos: "+seconds);
		
		
	}

}
