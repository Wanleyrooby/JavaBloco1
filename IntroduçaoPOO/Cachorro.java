package IntroduçaoPOO;

public class Cachorro extends Animal{
	
	public void nome()
	{
		this.nome="Vay";
		System.out.println("NOME: "+this.nome);
	}
	public void idade()
	{
		this.idade="10 meses";
		System.out.println("IDADE: "+this.idade);
	}
	
	
	public void ato()
	{
		System.out.println(this.nome+" esta correndo");
	}
	public void emitirSom()
	{
		System.out.println("Hau Hau");
	}

}
