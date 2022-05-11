package IntroduçaoPOO;

public class ModeloFuncionario {
	
	String nome;
	String CPF;
	String RG;
	String cargo;
	String dataDeContrataçao;
	double salario;
	boolean gosta;
	
	public void escrever()
	{
		if (this.gosta==true)
			System.out.println("Parabens pelo esforço quotidiano!!!");
		else 
			System.out.println("Voce deveria procurar um outro emprego.");
	}
	public void gosta()
	{
		this.gosta=true;
	}
	public void naogosta()
	{
		this.gosta=false;
	}
	public void estadoAtual()
	{
		System.out.println("Nome completo: "+this.nome);
		System.out.println("CPF: "+this.CPF);
		System.out.println("RG: "+this.RG);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Data de contratacao: "+this.dataDeContrataçao);
		System.out.println("Salario: "+"R$"+this.salario);
		System.out.println("Voce gosta do seu emprego? "+this.gosta);
	}
}
