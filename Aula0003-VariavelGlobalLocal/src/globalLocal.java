import javax.swing.JOptionPane;

public class globalLocal {
	//essa � uma vari�vel global, pois, est� fora dos m�todos
	static int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
	
	public static void main(String[] args) {
		//essa � uma vari�vel local, pois, est� dentro do metodo main
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
		int soma = num1+num2;
		System.out.println("N�mero 1: "+num1);
		System.out.println("N�mero 2: "+num2);
		//chamando m�todo2, pois, somente o main � executado automaticamente
		metodo2();
		
		//A Exibi��o da soma desse metodo vem depois, apra que seja capturado primeiramento terceiro numero
		JOptionPane.showMessageDialog(null, "A soma do primeiro n�mero com o segundo �: "+soma);
	}

	public static void metodo2 () {
		//essa � outra vari�vel local, pois, est� dentro do m�todo2
		int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um terceiro n�mero"));
		int soma = num1+num3;
		JOptionPane.showMessageDialog(null, "A soma do primeiro n�mero com o terceiro �: "+soma);
		System.out.println("N�mero 3: "+num3);
	}
	
}
