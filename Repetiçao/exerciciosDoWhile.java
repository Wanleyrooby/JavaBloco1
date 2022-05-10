package Repetiçao;

import java.util.Scanner;

public class exerciciosDoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,s=0;
		do {
			System.out.println("Digite um numero : ");
			n=ler.nextInt();
			if (n!=0) {
				s+=n;
			}
		}
		while (n>0);
		System.out.println("A soma dos numeros digitados: " + s);
	}
}				
			
	
		
