package LaçoDecisão; // DONE

import java.util.Scanner;
public class Tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEnter with your age to see the category you belong to:");
		age = read.nextInt();
		
		if(age>=10 && age<=14){
			System.out.println("\nYour Category is Infantil.");
			}
		if(age>=15 && age<=17){
			System.out.println("\nYour Category is Juvenil.");
			}
		if(age>=18 && age <=25){
			System.out.println("\nYour Category is Adulto.");
		}
	}
}


