package LaçoDecisão; // DONE

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n,n1,n2,n3, aux=0; // media = 0 

		System.out.println("\nEnter with the first number: ");
		n1 = read.nextInt();
		System.out.println("\nEnter with the second number: ");
		n2 = read.nextInt();
		System.out.println("\nEnter with the third number: ");
		n3 = read.nextInt();
		
		if(n1>aux){
			aux = n1;
			if(n2>aux){
				aux = n2;
				if(n3>aux){
					aux = n3;
				}
			}
		}
		System.out.println("The highest number is: "+ aux);
	}
}
