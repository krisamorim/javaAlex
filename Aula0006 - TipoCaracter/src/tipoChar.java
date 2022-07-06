import javax.swing.JOptionPane;

public class tipoChar {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Sistema para alistamento militar");
		String opcao = JOptionPane.showInputDialog(null, "Qual seu Gênero?\nF - Feminino\nM - Masculino");
		char genero = opcao.charAt(0);

		if(genero == 'f' || genero == 'F') {
			JOptionPane.showMessageDialog(null, "Você é do sexo feminino e por isso não pode se alistar");
		}else if(genero == 'm' || genero == 'M') {
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
			if(idade >= 18) {
				JOptionPane.showMessageDialog(null, "Você ja TEM idade para se apresentar ao serviço militar");
			}else {
				JOptionPane.showMessageDialog(null, "Você NÃO tem idade para se apresentar ao serviço militar");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}
	}

}
