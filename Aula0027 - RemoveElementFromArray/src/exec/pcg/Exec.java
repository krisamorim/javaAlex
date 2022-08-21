package exec.pcg;
import javax.swing.JOptionPane;

import obj.pcg.*;

public class Exec {

	public static void main(String[] args) {
		//#Code concerning student
		//0001-Creating the student object
		Student student1 = new Student();
		//0002-Getting student name and setting it
		student1.setName(JOptionPane.showInputDialog("What's the student name?"));
		//0003-Getting student CPF and setting it
		student1.setCpf(JOptionPane.showInputDialog("What's the student  Individual Registration?"));
		//0004 - Getting Student ID and setting it
		student1.setId(Integer.parseInt(JOptionPane.showInputDialog("What's the student ID")));
		//0011-Show student1 data in the console (without discipline data)
		System.out.println("Student data without discipline data: " + student1);
		
		//#Code concerning discipline
		//0005-creating a "for" to get discipline data then add it in a discipline list
		for(int i=1;i<5;i++) {
			//0006-Creating a variable named "ordinal" to save the "ordinal string"
			String ordinal = "th";
			//0007-Creating an "if" to define an ordinal sequence
			if (i==1) {
				ordinal = "st";
			}else if (i==2) {
				ordinal = "nd";
			}else if (i==3) {
				ordinal = "rd";
			}
			//0008-Instantiating the discipline object
			Discipline aDiscipline = new Discipline();
			//0009-Getting Discipline name and set it
			aDiscipline.setName(JOptionPane.showInputDialog("What's the NAME of the "+ i + ordinal + " discipline?"));
			//0010-Getting Discipline grade and set it
			aDiscipline.setGrade(Double.parseDouble(JOptionPane.showInputDialog("What's the GRADE of the " + i + ordinal + " discipline")));
			//0012-Show the discipline in the console
			System.out.println(aDiscipline);
			//0013-Adding the discipline data in the student list
			student1.getDisciplines().add(aDiscipline);			
		}
		//0014-show in the console the student data with the discipline data
		System.out.println(student1);
		
		//0015-Show the final result
		JOptionPane.showMessageDialog(null, "The Student average was " + student1.getAverage() + "\n" + student1.getFinalResult());
		
		
	}
}
