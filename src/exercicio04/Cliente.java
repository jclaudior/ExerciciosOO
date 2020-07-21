package exercicio04;

public class Cliente extends Pessoa{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		String dados = "CPF: "+this.cpf;
		System.out.println(dados);
	}
}
