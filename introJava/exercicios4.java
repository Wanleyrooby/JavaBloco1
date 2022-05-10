package introJava;

import java.util.Scanner;

public class exercicios4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		double x;
		
		System.out.println("Digite um numero: ");
		n=ler.nextInt();
		
		if (n%2==0) {
			System.out.println("\nO numero digitado e: Par");
			x=Math.sqrt(n);
			System.out.println("\nA raiz quadrada e: "+ x);
		}
		if (n%2!=0) {
			System.out.println("\nO numero digitado e: Impar");
			x=Math.pow(n, 2);
			System.out.println("\nO numero elevado ao quadrado e igual a: "+ x);
		}
	}
}
