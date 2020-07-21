package exercicio01;

public class Bicicleta {
	private String cor;
	private int aro;
	private String modelo;
	
	public Bicicleta() {
		
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void andar() {
		System.out.println("Esta em movimento!");
	}
	public void grau(){
		System.out.println("Andando em uma Roda!");
	}
}
