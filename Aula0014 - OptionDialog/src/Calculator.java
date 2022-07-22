import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		String[] options = new String[] {
				"Sum", //0
				"Subtract", //1
				"Multiply", //2
				"New numbers", //3
				"Quit" //4
		};
		int choice = options.length;
		System.out.println("Choice start with: " + choice);
		double number1 = Double.parseDouble(JOptionPane.showInputDialog("Type the 1st number:"));
		double number2 = Double.parseDouble(JOptionPane.showInputDialog("Type the 2nd number:"));

		while(choice != options.length-1) {
			choice = JOptionPane.showOptionDialog(
					null, 
					"Select an option", 
					"Calculator!", 
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					0);
			System.out.println("Choice was: " + choice);
			if (choice == 0) {
				JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " is: " + (number1+number2));
			}else if (choice == 1) {
				JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " is: " + (number1-number2));
			}else if (choice == 2) {
				JOptionPane.showMessageDialog(null, number1 + " x " + number2 + " is: " + (number1*number2));
			}else if (choice == 3) {
				number1 = Double.parseDouble(JOptionPane.showInputDialog("Type the 1st number:"));
				number2 = Double.parseDouble(JOptionPane.showInputDialog("Type the 2nd number:"));
			}else {
				JOptionPane.showMessageDialog(null, "Bye");
			}
		}
	}

}
