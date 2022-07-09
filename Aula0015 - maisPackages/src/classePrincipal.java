import pckAluno.Aluno;

public class classePrincipal {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		//utilizando o contrutor que só receber nome
		Aluno aluno3 = new Aluno("Maria");

		//utilizando o construturo que recebe nome e idade
		Aluno aluno4 = new Aluno("José", 50);
	}

}
