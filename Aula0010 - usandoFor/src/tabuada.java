import java.util.Random;
import javax.swing.JOptionPane;

public class tabuada {

	public static void main (String[] args) {
		//perguntar qual tabuada deseja
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada voc� Deseja?"));
		System.out.println("N�mero escolhido foi "+num1);
		
		//criar for
		for (int i=1; i <= 10; i++) {
			//imprimir no console
			System.out.println(num1+" x "+i+" = "+(num1*i));
		}
		criaNumAleatorio();
	}
	
	//c�digo bonus
	public static void criaNumAleatorio() {
		Random gerador = new Random();
		System.out.println("\nRodando codigo bonus");
		
		//gerando 10 numeros aleat�rios de 0 a 50
		for (int i = 0; i < 10; i++) {
			System.out.println(gerador.nextInt(50));
	    }
	}
}
