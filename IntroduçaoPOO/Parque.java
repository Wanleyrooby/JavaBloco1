package IntroduçaoPOO;

public class Parque {

	public static void main(String[] args) {
		
		Cachorro chorro = new Cachorro();
		Cavalo valo = new Cavalo();
		Preguica guica = new Preguica();
		
		System.out.println("Cachorro");
		chorro.nome();
		chorro.idade();
		chorro.ato();
		chorro.emitirSom();
		
		System.out.println("\nCavalo");
		valo.nome();
		valo.idade();
		valo.ato();
		valo.emitirSom();
		
		System.out.println("\nPreguica");
		guica.nome();
		guica.idade();
		guica.ato();
		guica.emitirSom();
		
		
		
		
		
		
		
		
		
		
		

	}

}
