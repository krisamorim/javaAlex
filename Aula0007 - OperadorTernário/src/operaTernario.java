import javax.swing.JOptionPane;

public class operaTernario {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
		int nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));
		int media = (nota1+nota2+nota3+nota4)/4;
		
		//ternario simples
		//String resultado = media >= 70 ? "Aluno aprovado" : "Aluno Reprovado";
		
		//ternario composto (um ternerio dentro do outro)
		String resultado = media >= 70 ? "Aluno aprovado" : (media>= 40 && media <=69) ? "Aluno em recuperação" : "Aluno reprovado";
		
		JOptionPane.showMessageDialog(null, "A mpedia entre "+nota1+", "+nota2+", "+nota3+", "+nota4+" é "+media+"\n"+resultado);
		
		System.out.println(resultado);

	}

}
