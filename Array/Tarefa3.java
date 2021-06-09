package Array;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int linha, coluna, matriz[][] = new int[2][2], cont = 0;
		
		for( linha = 0; linha < 2; linha++) {
			for ( coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insert a value:");
				matriz[linha][coluna] = read.nextInt();
				if(matriz[linha][coluna] > 10) {
					cont++;
				}
			}
		}
		System.out.println("\nThis matrix has: "+cont+" Numbers higher than 10.");
	}
}
