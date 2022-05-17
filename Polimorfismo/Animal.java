package Polimorfismo;

public abstract class Animal implements PadraoAnimal{
	
	private String nome;
	private String idade;
	
	public void emitirSom()
	{
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
