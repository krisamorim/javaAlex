import pckgSecundario.*;
public class ClassePrincipal {

	public static void main(String[] args) {

		Xpto aluno1 = new Xpto();
		
		Xpto aluno2 = new Xpto("Carla");
		
		aluno2.yearsOld = 50;
		System.out.println(aluno2.name);
		System.out.println(aluno2.yearsOld);
	}

}
