import javax.swing.JOptionPane;

public class dialogoConfirmacao {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calculadora");
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro número?"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o segund número?"));
		//int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n1 p/ Somar\n2 p/ Subtrair\n3 p/ multiplicar\n4 p/ Dividir"));
		int confirma = JOptionPane.showConfirmDialog(null, "Deseja somar?");
		if(confirma == 1 || confirma == 2) {
			JOptionPane.showMessageDialog(null, "Até logo.");
		}else {
			JOptionPane.showMessageDialog(null, "A soma de "+num1+" + "+num2+" é "+(num1+num2));
		}

	}

}
