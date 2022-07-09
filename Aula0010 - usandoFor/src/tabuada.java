import java.util.Random;
import javax.swing.JOptionPane;

public class tabuada {

	public static void main (String[] args) {
		//perguntar qual tabuada deseja
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada você Deseja?"));
		System.out.println("Número escolhido foi "+num1);
		
		//criar for
		for (int i=1; i <= 10; i++) {
			//imprimir no console
			System.out.println(num1+" x "+i+" = "+(num1*i));
		}
		criaNumAleatorio();
	}
	
	//código bonus
	public static void criaNumAleatorio() {
		Random gerador = new Random();
		System.out.println("\nRodando codigo bonus");
		
		//gerando 10 numeros aleatórios de 0 a 50
		for (int i = 0; i < 10; i++) {
			System.out.println(gerador.nextInt(50));
	    }
	}
}
