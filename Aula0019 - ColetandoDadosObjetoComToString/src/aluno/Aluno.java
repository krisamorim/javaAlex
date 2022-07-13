package aluno;

public class Aluno {
	//variáveis
	String nome;
	int anoNascimento;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	String matricula;
	
	//geters & seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return 2022-this.anoNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getMedia() {
		return (this.nota1+this.nota2+this.nota3+this.nota4)/4;
	}
	public boolean getAprovado() {
		return getMedia() > 5.5 ? true : false;
	}
	public String getStatus() {
		return getMedia() > 7 ? "APROVADO" : getMedia() > 5.5 ? "EM RECUPERAÇÂO" : "REPROVADO";
	}
	
	//toString
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", anoNascimento=" + anoNascimento + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", nota4=" + nota4 + ", matricula=" + matricula + ", getMedia()=" + getMedia()
				+ ", getAprovado()=" + getAprovado() + ", getStatus()=" + getStatus() + "]";
	}
}
