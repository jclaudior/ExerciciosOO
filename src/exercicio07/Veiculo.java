package exercicio07;

public class Veiculo {
	private String nome;
	private int numeroDeRodas;
	private double capacidadeTanqueCombustivel;
	private double consumo;
	private double tanque;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public void setNumeroDeRodas(int numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}

	public double getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public void setCapacidadeTanqueCombustivel(double capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public boolean abastecer(double qtdCombustivel) {
		if(qtdCombustivel < this.capacidadeTanqueCombustivel) {
			this.tanque = qtdCombustivel;
			return true;
		}else {
			return false;
		}
	}
	
	public void exibirAutonomia() {
		double autonomia = this.tanque*this.consumo;
		System.out.println("Autonomia de "+autonomia + "Km/L");
	}
}
