package exec.pckg;
import javax.swing.JOptionPane;

import objts.pckg.*;
public class Exec {

	public static void main(String[] args) {
		
		//#Code about student 
		//001-Creating the object "student1"
		Student student1 = new Student();
		//002-Getting name using JOpane and setting it 
		student1.setStudentName(JOptionPane.showInputDialog("What's the student name?"));
		//003-Getting student1 ID using JOpane and setting it
		student1.setStudentID(Integer.parseInt(JOptionPane.showInputDialog("What's the Student ID?")));
		//004-Getting student1 Individual Registration using JOpane and setting it
		student1.setStudentCPF(JOptionPane.showInputDialog("What's the student Individual Resgistration?"));

		//#Code about discipline
		//005-Creating a for to get discipline data and setting it
		for(int counter=1; counter<5;counter++) {
			String ordinal = "th";
			//006-Doing an IF to creating custom questions
			if(counter==1) {
				ordinal = "st";
			}else if (counter==2) {
				ordinal = "nd";	
			}else if (counter==3) {
				ordinal = "rd";
			}
			//007-creating a discipline object
			Discipline discipline = new Discipline();
			discipline.setDisciplineName(JOptionPane.showInputDialog("What's the name of the "+ counter + ordinal + " discipline?"));
			discipline.setDisciplineGrade(Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the " + counter + ordinal + " discipline?")));
			//008-adding discipline data in to the student list
			student1.getDisciplines().add(discipline);
		}
		
		//009-Show variables' values in the the terminal
		System.out.println(student1);
		
		//010-Variable to set result
		String result = student1.getAverage() > 7 ? "Student accredited" : student1.getAverage() > 5 ? "To retake test" : "Fail";
		
		//011-Show message result
		JOptionPane.showMessageDialog(null, "The average was " + student1.getAverage() + "\n" + result);
	}
}
