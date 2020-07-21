package exercicio04;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String cidadeDeNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidadeDeNascimento() {
		return cidadeDeNascimento;
	}
	public void setCidadeDeNascimento(String cidadeDeNascimento) {
		this.cidadeDeNascimento = cidadeDeNascimento;
	}
	
	public void exibirDados() {
		String dados = "Nome: "+this.nome+"\nIdade: "+this.idade+"\nCidade de Nascimento: "+this.cidadeDeNascimento;
		System.out.println(dados);
	}
	
}
