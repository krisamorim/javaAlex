package main;
import javax.swing.JOptionPane;

import student.*;

public class Main {

	public static void main(String[] args) {
		//instance student1 variable
		Student student1 = new Student();
		Student student2 = new Student();
		
		//get the name of the first student
		student1.setName(JOptionPane.showInputDialog("What's the name of the first student?"));
		//get the name of the second student
		student2.setName(JOptionPane.showInputDialog("What's the name of the second student?"));
		//set the id of the first student
		student1.setId(Integer.valueOf(JOptionPane.showInputDialog("What's the id of the first student?")));
		//set the id of the second student
		student2.setId(Integer.valueOf(JOptionPane.showInputDialog("What's the id of the second student?")));
		
		//using "equals" in while
		while(Integer.valueOf(student1.getId()).equals(Integer.valueOf(student2.getId()))) {
			//show in the console
			System.out.println("student1.ID: " + student1.getId() + "\nstudent2.ID:  " + student2.getId());
			//show message informing that the same id is not allowed in different students
			JOptionPane.showMessageDialog(null, "the same id is not allowed in different students\nPlease, set the Ids again");
			//set the id of the first student
			student1.setId(Integer.valueOf(JOptionPane.showInputDialog("What's the id of the first student?")));
			//set the id of the second student
			student2.setId(Integer.valueOf(JOptionPane.showInputDialog("What's the id of the second student?")));
		}
		
		
		student1.setYearBirth(Integer.valueOf(JOptionPane.showInputDialog("What's the student's year of birth?")));
		student1.setGrade1(Double.valueOf(JOptionPane.showInputDialog("What's the 1st grade?")));
		student1.setGrade2(Double.valueOf(JOptionPane.showInputDialog("What's the 2nd grade?")));
		student1.setGrade3(Double.valueOf(JOptionPane.showInputDialog("What's the 3rd grade?")));
		student1.setGrade4(Double.valueOf(JOptionPane.showInputDialog("What's the 4th grade?")));

		//show variables' values in the console
		System.out.println(student1);
		
		//show messages
		JOptionPane.showMessageDialog(null, "Student " + student1.getName() + "'s (id: " + student1.getId() + ") grades where as follows:\n" + "1st: " + student1.getGrade1() + "\n2nd: " + student1.getGrade2() + "\n3rd: " + student1.getGrade3() + "\n4th: " + student1.getGrade4());
	}

}
