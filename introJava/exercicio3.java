package introJava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int idade ;
		 
		System.out.println("Insira a sua idade: ");
		idade=ler.nextInt();
		
		if (10<=idade && idade<=14) {
			System.out.println("\nVoce faz parte do grupo infantil");
		}
		if (15<=idade && idade<=17) {
			System.out.println("\nVoce faz parte do grupo juvenil");
		}
		if (18<=idade && idade<=25) {
			System.out.println("\nVoce faz parte do grupo adulto");
			
			
		}
        else {
        	System.out.println("\nVoce nao faz parte de nenhum dos grupos");
        }
	}

}
