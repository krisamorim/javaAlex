import Aluno.aluno;

public class principal {

	public static void main(String[] args) {
		//iniciando variavel aluno1 utilizando a inst�ncia aluno, esse new aluno() s� � permitido vazio devido o construtor aluno() na linha 10 da classe aluno do outro pacote
		aluno aluno1 = new aluno();
		
		//forma um de criar variavel utilizando o metodo
		aluno aluno2 = new aluno("Pedro",50);
		
		//forma dois de cirar variavel utilizando metodo
		aluno1.nome = "Ana";
		aluno1.idade = 60;
		
		System.out.println("o nome do aluno2 � "+aluno2.nome+" e ele tem "+aluno2.idade+" anos");
		
		

	}

}
