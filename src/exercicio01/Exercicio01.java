package exercicio01;

public class Exercicio01 {
	public static void main (String args[]) {
		Bicicleta bicicletaAzul = new Bicicleta();
		bicicletaAzul.setCor("Azul");
		bicicletaAzul.setAro(20);
		bicicletaAzul.setModelo("Urbana");
		bicicletaAzul.andar();
		
		Bicicleta bicicletaRosa = new Bicicleta();
		bicicletaRosa.setCor("Rosa");
		bicicletaRosa.setAro(21);
		bicicletaRosa.setModelo("Dobravel");
		bicicletaRosa.grau();
		
		Bicicleta bicicletaPreta = new Bicicleta();
		bicicletaPreta.setCor("Preta");
		bicicletaPreta.setAro(19);
		bicicletaPreta.setModelo("Montain Bike");
		bicicletaPreta.andar();	
	}

}

