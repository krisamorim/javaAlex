import javax.swing.JOptionPane;

public class operaTernario {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
		int nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));
		int media = (nota1+nota2+nota3+nota4)/4;
		
		String resultado = media >= 170 ? "Aluno aprovado" : "Aluno Reprovado";
		
		System.out.println(resultado);

	}

}
