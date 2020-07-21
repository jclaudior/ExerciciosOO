package exercicio04;

public class Funcionario extends Pessoa{
	private int numeroMatricula;

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		String dados = "Numero de Matricula: "+this.numeroMatricula;
		System.out.println(dados);
	}
}
