package introJava;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
		int num1,num2,num3 ;
		
		System.out.println("Digite o primeiro numero: ");
		num1=ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2=ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3=ler.nextInt();
		
		if (num1<num2 && num2<num3 ) {
	
	     System.out.println("\n" +num1+" "+ num2+" "+ num3);
		}
		else if  (num2<num3 && num3<num1) {
			System.out.println("\n" +num2+ " "+num3+" "+num1);
		}
		else if (num2<num1 && num1<num3){
			System.out.println("\n" +num2+" "+num1+" "+num3);
		}
		else if (num3<num2 && num2<num1) {
		    System.out.println("\n" +num3+" "+num2+" "+num1);
		}
		else if (num1<num3 && num3<num2) {
			System.out.println("\n" +num1+" "+num3+" "+num2);
		}
		else if (num3<num1 && num1<num2) {
			System.out.println("\n" +num3+" "+num1+" "+num2);
		
		
		}
		
	}
	
}
		
	



	
	


		
	

	


