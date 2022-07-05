package calcMedia;

import javax.swing.JOptionPane;

public class calcMedia {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
		int nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));
		JOptionPane.showMessageDialog(null, "A média é: "+ (nota1+nota2+nota3+nota4)/4);

	}

}
