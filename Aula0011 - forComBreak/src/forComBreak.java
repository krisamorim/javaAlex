import java.util.Random;

import javax.swing.JOptionPane;

public class forComBreak {

	public static void main(String[] args) {
		int contador = 0;
		int numDesejado = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual numero deseja entrar entre 0 e 20?"));
		for (int i=1; i < 400; i++) {
			contador++;
			//gera numero aleatorio
			Random gera = new Random();
			//gera numero de 0 a 10 em tipo INT
			int aleatorio = gera.nextInt(21);
			
			if(aleatorio == numDesejado) {
				System.out.println(aleatorio+"\nEba! achei o "+aleatorio);
				break;
			}else {
				System.out.println(aleatorio);
			}
		}
		System.out.println("Quantidade de tentativas: "+contador);
	}

}
