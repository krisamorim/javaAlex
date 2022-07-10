package pckgSecundaria;

public class Aluno {

	//estou deixando public para que a linha 12 da classe Principal do pacote pckPrincital funcione
	public String name;
	private int yearsOld;
	private String father;
	private String mother;
	private String generalBrazilREgister;
	private String personalBrsilRegister;
	private String id;
	private String serieMatriculada;
	
	//Criando um construtor para permitir que o metodo receba valor null, OBS: somente para fins didaticos, não se usa na pratica
	public Aluno() {
		
	}

	//Criando um construtor para permitir que o metodo receba string nome e int idade, OBS: somente para fins didaticos, na pratica se usa os metodos get em set
	public Aluno(String name, int yearsOld) {
		this.name = name;
		this.yearsOld = yearsOld;
	}
	
	//criando método set para name
	public void setName(String name) {
		this.name = name;
	}
	
	//criando método get para name
	public String getName() {
		return name;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getGeneralBrazilREgister() {
		return generalBrazilREgister;
	}

	public void setGeneralBrazilREgister(String generalBrazilREgister) {
		this.generalBrazilREgister = generalBrazilREgister;
	}

	public String getPersonalBrsilRegister() {
		return personalBrsilRegister;
	}

	public void setPersonalBrsilRegister(String personalBrsilRegister) {
		this.personalBrsilRegister = personalBrsilRegister;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSerieMatriculada() {
		return serieMatriculada;
	}

	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}
	
	
}
