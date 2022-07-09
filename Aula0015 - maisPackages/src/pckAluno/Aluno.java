package pckAluno;

public class Aluno {
	String nome;
	int idade;
	String dataNascimento;
	String rg;
	String cpf;
	String mae;
	String pai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculada;
	
	//construtor que é quem cria os dados na memória, não precisa criar pois o java ja cria automaticamente
	public Aluno() {
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
