import javax.swing.JOptionPane;

public class tipoDouble {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
		String numero2 = JOptionPane.showInputDialog(null, "Dgite o segundo número: ");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		JOptionPane.showMessageDialog(null, "A média entre "+num1+" e "+num2+" é "+(num1+num2)/2+"\nIsso ocorre pq as variáveis são INT");

		JOptionPane.showMessageDialog(null, "Agora vamos refazer utilizando variável do tipo DOUBLE");
		double num3 = Double.parseDouble(numero1);
		double num4 = Double.parseDouble(numero2);
		JOptionPane.showMessageDialog(null, "A média entre "+num1+" e "+num2+" é "+ (num3+num4)/2);
		
	}

}
