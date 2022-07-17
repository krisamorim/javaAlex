package systemMain;
import javax.swing.JOptionPane;

import systemclasses.*;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName(JOptionPane.showInputDialog("What's the Student's name?"));
		student1.setId(1);
		student1.setPeopleRegister(JOptionPane.showInputDialog("What's the Student's person register?"));
		
		student1.getDiscipline().setGrade1(Double.parseDouble(JOptionPane.showInputDialog("What's the 1st grade of the student?")));
		student1.getDiscipline().setGrade2(Double.parseDouble(JOptionPane.showInputDialog("What's the 2dn grade of the Student?")));
		student1.getDiscipline().setGrade3(Double.parseDouble(JOptionPane.showInputDialog("What's the 3rd grade of the Student?")));
		student1.getDiscipline().setGrade4(Double.parseDouble(JOptionPane.showInputDialog("What's the 4th grade of the student?")));
		
		//show student1 in the console
		System.out.println(student1);
		
		JOptionPane.showMessageDialog(null, "The student " + student1.getName() + "had an average of " + student1.getAveraged() + ", for this, the status is " + student1.getStatus());
		
		
	
	}

}
