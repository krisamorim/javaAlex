import javax.swing.JOptionPane;

public class tipoDouble {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro n�mero: ");
		String numero2 = JOptionPane.showInputDialog(null, "Dgite o segundo n�mero: ");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		JOptionPane.showMessageDialog(null, "A m�dia entre "+num1+" e "+num2+" � "+(num1+num2)/2+"\nIsso ocorre pq as vari�veis s�o INT");

		JOptionPane.showMessageDialog(null, "Agora vamos refazer utilizando vari�vel do tipo DOUBLE");
		double num3 = Double.parseDouble(numero1);
		double num4 = Double.parseDouble(numero2);
		JOptionPane.showMessageDialog(null, "A m�dia entre "+num1+" e "+num2+" � "+ (num3+num4)/2);
		
	}

}
