package ExercicioCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		int op,x, cont;
		
		List<String> prato = new ArrayList<String>();
		List<Integer> valor = new ArrayList<Integer>();
			
		prato.add("Picanha"); valor.add(25);
		prato.add("Bife"); valor.add(5);
		prato.add("Ovo"); valor.add(10);
		
		do {
		System.out.println("\n------Menu de Opções Pratos------");
		System.out.println("\n 1- Insert data in list \n 2- Remove data from list\n"
				+ " 3- Update data from list\n 4- Show all data from list\n 5- Exit");
				op = read.nextInt();

		switch(op) {
		case 1:
			read.nextLine();
			System.out.println("\n Type the data you want to storage in list: ");
			String seila = read.nextLine();
			prato.add(seila);
			System.out.println("\n Data sucefull insered.");
			break;
		
		case 2:
			read.nextLine();
			System.out.println("\n Type the data you want to remove from list: ");
			String seila2 = read.nextLine();
			if(prato.contains(seila2)) {
				
				prato.remove(seila2);
				System.out.println("\n Data sucefull removed.");
			}
			else {
				System.out.println("\n 404 - Data not found.");
			}
			break;
		
		case 3:
			read.nextLine();
			System.out.println("\n Type the new data you want to overwrite from list: ");
			String verify = read.nextLine();
			System.out.println("\n Type the data you want to be overwrited from the new data: ");
			String novoseila = read.nextLine();
			if(prato.contains(verify)){
			
				prato.remove(verify);
				prato.add(novoseila);
			}
			else {
				System.out.println("\nData doesnt exists on list.");
			}
			System.out.println(prato);
			break;
			
		case 4:
			read.nextLine();
			System.out.println("\nAll data From List.");
			System.out.println(prato);
			break;
			default:
				System.out.println("\nSystem finished.");
			}
		}
		while(op!=5);
	}
}
