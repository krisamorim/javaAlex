import java.sql.Date;
import javax.swing.JOptionPane;

//add esse comentario
public class Pessoa {
	public static void main(String args[]) {
		int soma;
		int num1 = 0;
		int num2 = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número:"));
		
		soma = num1+num2;
		
		JOptionPane.showMessageDialog(null,"A soma é: "+soma);
		System.exit(0);
	}
/*
	private String nome;
	private String sobrenome;
	private int idade;	
	private Date dataNascimento;
	private Date dataCadastro;
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
*/
}



