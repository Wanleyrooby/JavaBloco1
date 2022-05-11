package IntroduçaoPOO;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		ModeloFuncionario funcionario1 = new ModeloFuncionario();
		Scanner ler = new Scanner(System.in);
		System.out.println("*********FUNCIONARIO 1*********");
		funcionario1.nome = "Aline Santos";
		funcionario1.CPF = "458.902.437-99";
		funcionario1.RG = "34.555.999-1";
		funcionario1.cargo = "Gerente";
		funcionario1.dataDeContrataçao = "10/02/2010";
		funcionario1.salario = 4000.00;
		funcionario1.naogosta();
		funcionario1.estadoAtual();
		funcionario1.escrever();
		
				
		

	}

}
