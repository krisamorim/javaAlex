package pckgPrincipal;
import pckgSecundaria.*;

public class Principal {

	public static void main(String[] args) {
		
		//iniciando metodo aluno na vari�vel aluno1 
		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno("Kris",38);
		
		//forma n�o usual para definir um nome
		//aluno1.name = "Luis";
		
		//usando o metodo set para definir um novo nome
		aluno1.setName("Luis");
		//usando o metodo getNaem para recuperar o valor da variavel name 
		System.out.println("aluno1 = "+aluno1.getName());
		

		//a forma aluno2.name � forma n�o usual a forma correta � usando o get
		System.out.println("aluno2 = "+aluno2.name);
		
	
		aluno1.setYearsOld(19);
		aluno2.setFather("Jo�o");
		
		System.out.println("aluno1.setYearsOld = "+aluno1.getYearsOld());
		System.out.println("aluno2.setFather = "+aluno2.getFather());
	}

}
