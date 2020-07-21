package exercicio07;

public class Exercicio07 {
	public static void main(String[]args) {
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setNome("Uno");
		veiculo1.setNumeroDeRodas(4);
		veiculo1.setCapacidadeTanqueCombustivel(40);
		veiculo1.setConsumo(15);
		
		veiculo1.abastecer(35);
		veiculo1.exibirAutonomia();
		
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNome("Fan150");
		veiculo2.setNumeroDeRodas(2);
		veiculo2.setCapacidadeTanqueCombustivel(25);
		veiculo2.setConsumo(22);
		
		veiculo2.abastecer(20);
		veiculo2.exibirAutonomia();
	}
}
