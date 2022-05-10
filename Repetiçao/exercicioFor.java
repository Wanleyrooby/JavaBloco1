package Repetiçao;

import java.util.Scanner;

public class exercicioFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,contimp=0,contpar=0;
		
		for (int i=1;i<=10;i++) {
			  System.out.println("Insira um número: ");
			  n=ler.nextInt();
			  
			  if(n%2==0) {
					contpar=contpar+1;
			  }
			  if (n%2!=0) {
				  contimp=contimp+1;
			  }
		}
			 System.out.println("\nA quantidade de números pares digitados e: " + contpar);
			System.out.println("\nA quantidade de números ímpares digitados e: " + contimp);		
		  
		}
	}

	
	
					
			  
			  
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	


