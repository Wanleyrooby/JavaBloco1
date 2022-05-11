package IntroduçaoPOO;

public class ModeloCliente {
	 
	String nome;
	String nascimento;
	String sexo;
	String endereço;
	double renda;
	boolean possuo;
	
	
	public void escrever()
	{
		if(this.possuo==true)
		System.out.println("Que bom!!");
		else
			System.out.println("Vamos fazer um cartão de credito!!!");
	}
	public void possuo()
	{
		this.possuo=true;
	}
	public void naopossuo()
	{
		this.possuo=false;
	}
	public void estadoAtual()
	{
		System.out.println("Nome completo: "+this.nome);
		System.out.println("Data de nascimento: "+this.nascimento);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Endereco: "+this.endereço);
		System.out.println("Renda: "+"R$" +this.renda);
		System.out.println("Possui cartao de credito? "+this.possuo);
		
	}

}
