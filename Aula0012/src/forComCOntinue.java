import java.util.Random;

import javax.swing.JOptionPane;

public class forComCOntinue {

	public static void main(String[] args) {
		int contador = 0;
		int numDesejado = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual número entre 0 e 20 que você deseja encontrar?"));
		int qntidRepetidas = 0;
		
		for (int i = 0; i < 400; i++) {
			contador++;
			Random gerador = new Random();
			int aleatorio = gerador.nextInt(20);
			if (aleatorio == numDesejado && qntidRepetidas == 0) {
				System.out.println(aleatorio+"\nEba! Encontrei o numero "+numDesejado+" pela primera vez");
				qntidRepetidas++;
			}else if (aleatorio == numDesejado && qntidRepetidas == 1) {
				System.out.println(aleatorio+"\nEba! Encontrei o numero "+numDesejado+" pela segunda vez\nAgora vou parar");
				break;
			}else {
				System.out.println(aleatorio);
			}
		}
		
		System.out.println("Quantidade de tentativas: "+contador);

	}

}
