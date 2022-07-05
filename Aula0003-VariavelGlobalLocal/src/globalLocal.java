import javax.swing.JOptionPane;

public class globalLocal {
	//essa é uma variável global, pois, está fora dos métodos
	static int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
	
	public static void main(String[] args) {
		//essa é uma variável local, pois, está dentro do metodo main
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
		int soma = num1+num2;
		System.out.println("Número 1: "+num1);
		System.out.println("Número 2: "+num2);
		//chamando método2, pois, somente o main é executado automaticamente
		metodo2();
		
		//A Exibição da soma desse metodo vem depois, apra que seja capturado primeiramento terceiro numero
		JOptionPane.showMessageDialog(null, "A soma do primeiro número com o segundo é: "+soma);
	}

	public static void metodo2 () {
		//essa é outra variável local, pois, está dentro do método2
		int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um terceiro número"));
		int soma = num1+num3;
		JOptionPane.showMessageDialog(null, "A soma do primeiro número com o terceiro é: "+soma);
		System.out.println("Número 3: "+num3);
	}
	
}
