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
		
		//0016-Ask to remove
		int choise = JOptionPane.showConfirmDialog(null, "Want to remove some discipline?");
		
		//0017-
		if (choise == 0) {
			//0018-Creating variables 
			String firstDiscipline = student1.getDisciplines().get(0).getName();
			String secondDiscipline = student1.getDisciplines().get(1).getName();
			String thirdDiscipline = student1.getDisciplines().get(2).getName();
			String fourthDIscipline = student1.getDisciplines().get(3).getName();
			
			//0019
			int disciplineChoise = Integer.parseInt(JOptionPane.showInputDialog("Wich on? Type:\n1 for " + firstDiscipline + "\n2 for " + secondDiscipline + "\n3 for " + thirdDiscipline + "\n4 for " + fourthDIscipline));
			
			//0020-Show list before
			JOptionPane.showMessageDialog(null, "Discipline list before remove:\n" + student1.getDisciplines());
			
			//0021-Removing
			student1.getDisciplines().remove(disciplineChoise-1);
			
			//0022-Show list before remove
			JOptionPane.showMessageDialog(null, "Discipline list before remove:\n" + student1.getDisciplines());	
		}
		
		//0023-Ask to add
		int choiseAdd = JOptionPane.showConfirmDialog(null, "Want to add a new discipline?");
		//0017-
		if (choiseAdd == 0) {
			//0018-Creating variables
			Discipline addDiscipline = new Discipline();
			//0019-Setting data in the object
			addDiscipline.setName(JOptionPane.showInputDialog("What's the new discipline name?"));
			addDiscipline.setGrade(Double.parseDouble(JOptionPane.showInputDialog("What is the new discipline grade?")));
			
			//0021-Adding
			student1.getDisciplines().add(addDiscipline);
			
			//0021-Showing the discipline list
			JOptionPane.showMessageDialog(null, "The list:\n" + student1.getDisciplines());
			
		}
		
		//0015-Show the final result
		JOptionPane.showMessageDialog(null, "The Student average was " + student1.getAverage() + "\n" + student1.getFinalResult());
			
	}
}
