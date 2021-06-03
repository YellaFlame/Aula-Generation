package LaçoDecisão; //UNDONE

import java.util.Scanner;
public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter with the first number:");
		a = read.nextFloat();
		System.out.println("Enter with the second number:");
		b = read.nextFloat();
		System.out.println("Enter with the third number:");
		c = read.nextFloat();
		
		if(a<=b && b<=c){
			System.out.println(a+", "+b+", "+c);
		}
		else if(a<=c && c<=b){
			System.out.println(a+", "+c+", "+b);
		}
		else if(b<=a && a<=c){
			System.out.println(b+", "+a+", "+c);
		}
		else if(b<=c && c<=a){
			System.out.println(b+", "+c+", "+a);
		}
		else if(c<=a && a<=b){
			System.out.println(c+", "+a+", "+b);
		}
		else{
			System.out.println(c+", "+b+", "+a);
		}
	}
}
