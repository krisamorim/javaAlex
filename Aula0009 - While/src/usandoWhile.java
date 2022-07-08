import javax.swing.JOptionPane;

public class usandoWhile {

	public static void main(String[] args) {
		
		//essa vari�vel � somente para verificar quantas vezes a calculadora foi executada
		int contador = 1;
		
		//variavel que ir� armazenar a op��o digitada pelo usu�rio
		int opcao = 0;
		
		//enquanto for diferente de 5 executa a calculadora
		while (opcao != 5) {
			//incremento
			System.out.println("Execu��o numero "+contador);
			contador++;
			
			String num1 = JOptionPane.showInputDialog("Digite um numero");
			String num2 = JOptionPane.showInputDialog("Digite outro n�mero");
						
			
			if (num1 == null || num2 == null || num1.isEmpty() || num2.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Valor indevido");
			}else {
				
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o desejada:\n1 p/ somar\n2 p/ subtrair\n3 p multiplicar\n4 p/ dividir\n5 p/ SAIR"));
				
				//s� p/ mostrar o valor das vari�veis no console
				System.out.println("num1: "+num1+"\nnum2: "+num2);
				
				//convertendo de string p/ double para poder calcular
				double num1Double = Double.parseDouble(num1);
				double num2Double = Double.parseDouble(num2);
				
				switch (opcao){
				case 1:
					JOptionPane.showMessageDialog(null, num1+" + "+num2+" � igual a "+(num1Double+num2Double));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, num1+" - "+num2+" � igual a "+(num1Double-num2Double));
					break;
				case 3:
					JOptionPane.showMessageDialog(null, num1+" x "+num2+" � igual a "+(num1Double*num2Double));
					break;
				case 4:
					JOptionPane.showMessageDialog(null, num1+" dividido por "+num2+" � igual a "+(num1Double/num2Double));
					break;
				case 5:
					opcao = 5;
					JOptionPane.showMessageDialog(null, "At� mais");
					break;
				}
			}
		}
		
	}

}
