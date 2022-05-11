package IntroduçaoPOO;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		ModeloCliente cliente1 = new ModeloCliente();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("*********CLIENTE 1*********");
		cliente1.nome = "john Silva";
		cliente1.nascimento = "19 de dezembro de 1990";
		cliente1.sexo = "masculino";
		cliente1.endereço = "rua antonina,56";
		cliente1.renda = 1200.00;
		cliente1.possuo();
		cliente1.estadoAtual();
	    cliente1.escrever();
		
				
		

	}

}
