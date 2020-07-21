package exercicio05;

public class Lapis implements Escrevendo{
	private String ehFeitoDe;
	private String escreveCom;
	
	
	public Lapis(String ehFeitoDe, String escreveCom) {
		this.ehFeitoDe = ehFeitoDe;
		this.escreveCom = escreveCom;
	}
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	public String getEscreveCom() {
		return escreveCom;
	}
	
	public void escrever() {
		System.out.println("Escrevendo com "+this.escreveCom);
	}
}
