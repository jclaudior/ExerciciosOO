package exercicio04;

public class Exercicio04 {
	
	public static void main(String[]args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		cliente.setIdade(23);
		cliente.setCidadeDeNascimento("São Paulo");
		cliente.setCpf("22222222222");
		
		cliente.exibirDados();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Guilherme");
		funcionario.setIdade(34);
		funcionario.setCidadeDeNascimento("Rio de Janeiro");
		funcionario.setNumeroMatricula(1234);
		
		funcionario.exibirDados();
		
	}

}
