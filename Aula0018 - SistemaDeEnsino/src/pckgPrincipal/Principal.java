package pckgPrincipal;
import javax.swing.JOptionPane;

import pckgAluno.*;
public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(JOptionPane.showInputDialog("Qual o nome do aluno 1?"));
		aluno1.setCpf("123.123.123-00");
		aluno1.setAnoNascimento(2004);
		aluno1.setMae("Maria Silva");
		aluno1.setPai("João Pereira Silva");
		aluno1.setNota1(7);
		aluno1.setNota2(7);
		aluno1.setNota3(6);
		aluno1.setNota4(6);
		
		String statusAprovacao = aluno1.getAprovadoBoolean() ? "SIM" : "Não";
		
		/*
		if (aluno1.getAprovado()) {
			statusAprovacao = "Aprovado";
		}else {
			statusAprovacao = "Em recuperação";
		}
		*/
		
		JOptionPane.showMessageDialog(null, "A média do aluno "+aluno1.getNome()+" é "+aluno1.getMediaNota()+"\nO aluno esta aprovado? "+statusAprovacao+"\nA situação atual do aluno é "+aluno1.getAprovadoString());
		
		//mostrar no console
		System.out.println("A média do aluno "+aluno1.getNome()+" é "+aluno1.getMediaNota()+"\nO aluno está aprovado? "+statusAprovacao+"\nA situação atual do aluno é "+aluno1.getAprovadoString());
		
	}

}
