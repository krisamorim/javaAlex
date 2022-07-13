package main;
import javax.swing.JOptionPane;

import aluno.*;
public class Main {

	public static void main(String[] args) {
		
		//instanciando aluno1
		Aluno aluno1 = new Aluno();
		
		//coletando valores das variaveis
		aluno1.setNome(JOptionPane.showInputDialog("Qual o nome do aluno?"));
		aluno1.setAnoNascimento(Integer.valueOf(JOptionPane.showInputDialog("Em que ano o aluno nasceu?")));
		aluno1.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite a primeira nota: ")));
		aluno1.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite a segunda nota:")));
		aluno1.setNota3(Double.valueOf(JOptionPane.showInputDialog("Digite a terceira nota:")));
		aluno1.setNota4(Double.valueOf(JOptionPane.showInputDialog("Digite a quarta nota:")));
		aluno1.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno"));
		
	
		//exibindo mensagem
		JOptionPane.showMessageDialog(null, "O aluno " + aluno1.getNome() + ", de matricula " + aluno1.getMatricula() + "\nHoje com " + aluno1.getIdade() + " anos de idade, obteve as seguitnes notas:\nProva 1: " + aluno1.getNota1() + "\nProva 2: " + aluno1.getNota2() + "\nProva 3: " + aluno1.getNota3() + "\nProva 4: " + aluno1.getNota4());
		
		//imprimir no console os valores dos atributos do objeto
		System.out.println(aluno1);
		
		//mostrando status com dialog
		JOptionPane.showMessageDialog(null, "A média do aluno " + aluno1.getNome() + " é " + aluno1.getMedia() + " por isso " + aluno1.getNome() + " está " + aluno1.getStatus());
	
	
		
	}
}
