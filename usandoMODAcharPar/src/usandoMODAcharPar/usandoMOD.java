package usandoMODAcharPar;

import javax.swing.JOptionPane;

public class usandoMOD {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Esse é uma sistema que conta quantos numero impares e pares \nexistem em uma determinada sequencia");
		int numInicio = Integer.parseInt(JOptionPane.showInputDialog(null, "De quanto até quanto vocÊ quer verificar?\nInforme o numero onde será iniciado a contagem:"));
		int numFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número em que a contagem termina"));
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
		JOptionPane.showMessageDialog(null, "De "+numInicio+" até "+numFinal+" existem:\nNumeros pares: "+contaPar+"\nNumeros impares: "+contaImpar);
	}

}
