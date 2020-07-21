package exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta caneta = new Caneta("plástico", "tinta");
		caneta.escrever();
		
		Lapis lapis = new Lapis("madeira","grafite");
		lapis.escrever();
		
		PenaMosquito penaMosquito = new PenaMosquito("metal","nanquim");
		penaMosquito.escrever();
	}

}
