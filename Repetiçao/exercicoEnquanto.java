package Repetiçao;

import java.util.Scanner;

public class exercicoEnquanto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=0,cont1=0,cont2=0;
		
		for(i=1;i<=10;) {
					while(i!=-99) {
					
						System.out.println("\nDigite a sua idade: ");
					i=ler.nextInt();
					
					if (i<21 && i!=-99) {
						cont1++;}
					
					if (i>50) {
							cont2++;}
						}
					System.out.println("A quantidade de pessoas com menos de 21 anos: "+ cont1);
					System.out.println("\nA quantidade de pessoas com mais de 50 anos: " + cont2);
					break;
					}
					}
		}
	
	
		
		
		
	


	

	

		
		