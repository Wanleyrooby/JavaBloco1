package IntroduçaoPOO;

public class Preguica extends Animal {
	
	public void nome()
	{
		this.nome="Way";
		System.out.println("NOME: "+this.nome);
	}
	public void idade()
	{
		this.idade="12 meses";
		System.out.println("IDADE: "+this.idade);
	}
	public void ato()
	{
		System.out.println(this.nome+" esta subindo em Arvores");
	}
	public void emitirSom()
	{
		System.out.println("ZIIIIHHH");
	}

}
