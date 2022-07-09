import javax.swing.JOptionPane;

public class tabuada {

	public static void main(String[] args) {
		//perguntar qual tabuada deseja
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada você Deseja?"));
		System.out.println("Número escolhido foi "+num1);
		
		//criar for
		for (int i=1; i <= 10; i++) {
			//imprimir no console
			System.out.println(num1+" x "+i+" = "+(num1*i));
		}
	}

}
