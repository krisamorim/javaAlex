import javax.swing.JOptionPane;

public class tipoChar {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Sistema para alistamento militar");
		String opcao = JOptionPane.showInputDialog(null, "Qual seu G�nero?\nF - Feminino\nM - Masculino");
		char genero = opcao.charAt(0);

		if(genero == 'f' || genero == 'F') {
			JOptionPane.showMessageDialog(null, "Voc� � do sexo feminino e por isso n�o pode se alistar");
		}else if(genero == 'm' || genero == 'M') {
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
			if(idade >= 18) {
				JOptionPane.showMessageDialog(null, "Voc� ja TEM idade para se apresentar ao servi�o militar");
			}else {
				JOptionPane.showMessageDialog(null, "Voc� N�O tem idade para se apresentar ao servi�o militar");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Op��o invalida");
		}
	}

}
