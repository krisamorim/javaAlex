import javax.swing.JOptionPane;

public class switchCase {

	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero:"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero:"));
		
		int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada:\n1 p/ Somar\n2 p/ subtrair\n3 p/divir\n4 p/ multiplicar"));
		
		switch (operacao) {
		case 1:
			System.out.println("num1: "+num1+"\nnum2: "+num2);
			JOptionPane.showMessageDialog(null, num1+" + "+num2+" é igual a "+(num1+num2));
			break;
		case 2:
			System.out.println("num1: "+num1+"\nnum2: "+num2);
			JOptionPane.showMessageDialog(null, num1+" - "+num2+" é igual a "+(num1-num2));
			break;
		case 3:
			System.out.println("num1: "+num1+"\nnum2: "+num2);
			JOptionPane.showConfirmDialog(null, num1+" dividido por "+num2+" é igual a "+(num1/num2));
			break;
		case 4: 
			System.out.println("num1: "+num1+"\nnum2: "+num2);
			JOptionPane.showMessageDialog(null, num1+" x "+num2+"é igual a "+(num1*num2));
			break;
		}
	}

}
