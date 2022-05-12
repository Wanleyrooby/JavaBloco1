package IntroduçaoPOO;

public class Cavalo extends Animal{
	
	public void nome()
	{
		this.nome="Va";
		System.out.println("NOME: "+this.nome);
	}
	public void idade()
	{
		this.idade="11 meses";
		System.out.println("IDADE: "+this.idade);
	}
	public void ato()
	{
		System.out.println(this.nome+" esta correndo");
	}
	public void emitirSom()
	{
		System.out.println("HiiiHHHH");
	}

}
