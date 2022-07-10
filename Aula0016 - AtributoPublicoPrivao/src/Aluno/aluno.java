package Aluno;

public class aluno {
	//colocar public na frente para tornar o atributo acessivel para outros pacotes/classes
	public String nome;
	public int idade;
	String mae;
	String pai;
	
	public aluno() {
		
	}

	public aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
