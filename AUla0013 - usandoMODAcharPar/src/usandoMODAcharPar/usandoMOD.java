package usandoMODAcharPar;

import javax.swing.JOptionPane;

public class usandoMOD {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Esse � uma sistema que conta quantos numero impares e pares \nexistem em uma determinada sequencia");
		int numInicio = Integer.parseInt(JOptionPane.showInputDialog(null, "De quanto at� quanto voc� quer verificar?\nInforme o numero onde ser� iniciado a contagem:"));
		int numFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n�mero em que a contagem termina"));
		int contaImpar = 0;
		int contaPar = 0;
		
		for(int i = numInicio; i <= numFinal; i++) {
			System.out.println(i);
			if(i%2==0) {
				contaPar++;
			}else {
				contaImpar++;
			}
		}
		JOptionPane.showMessageDialog(null, "De "+numInicio+" at� "+numFinal+" existem:\nNumeros pares: "+contaPar+"\nNumeros impares: "+contaImpar);
	}

}
