package pckgAluno;

public class Aluno {
	
	//variaveis
	private String nome;
	private int anoNascimento;
	private String mae;
	private String pai;
	private String rg;
	private String cpf;
	private String matricula;
	
	//variaveis e metodos Set&get p/ calcular media
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getMediaNota() {
		return (nota1+nota2+nota3+nota4)/4;
	}
	
	//metodo para verificar aprovação no formato boolean
	public boolean getAprovadoBoolean() {
		double media = this.getMediaNota();
		return media > 7 ? true : false;
		
		/*
		if (media>7) {
			return true;
		}else {
			return false;
		}
		*/
	}
	
	//metodo para verificar se está provado retornado string
	public String getAprovadoString() {
		double media = this.getMediaNota();
		return media>7 ? "Aprovado" : media>=5 ? "Em recuperação" : "Reprovado";
	}
	
	//set e get metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
