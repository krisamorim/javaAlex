package main;
import javax.swing.JOptionPane;
import classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
				student1.setName(JOptionPane.showInputDialog("What's the student's name?"));
		student1.setPeopleRegister(JOptionPane.showInputDialog("What's the student's people register?"));
		student1.setId(Integer.parseInt(JOptionPane.showInputDialog("What's the student's ID?")));
		
		//discipline1
		Discipline discipline1 = new Discipline();
		discipline1.setDiscipline("Math");
		discipline1.setGrade(10);
		
		//show in the console
		System.out.println("discipline1: \n" + discipline1 + "\n" + "-------------------------------------\n");
		
		//discipline2
		Discipline discipline2 = new Discipline();
		discipline2.setDiscipline("Geography");
		discipline2.setGrade(9);
		//show in the console
		System.out.println("discipline2: \n" + discipline2 + "\n" + "-------------------------------------\n");
		
		//discipline3
		Discipline discipline3 = new Discipline();
		discipline3.setDiscipline("History");
		discipline3.setGrade(8);
		//show in the console
		System.out.println("discipline3: \n" + discipline3 + "\n" + "-------------------------------------\n");
		
		//discipline4
		Discipline discipline4 = new Discipline();
		discipline4.setDiscipline("English");
		discipline4.setGrade(7);
		//show in the console
		System.out.println("discipline4: \n" + discipline4 + "\n" + "-------------------------------------\n");
		

		//add discipline1 to array
		student1.getDisciplines().add(discipline1);
		//add discipline 2 to array
		student1.getDisciplines().add(discipline2);
		//add discipline3 to array
		student1.getDisciplines().add(discipline3);
		//add discipline4 to array
		student1.getDisciplines().add(discipline4);
		
		
		System.out.println("student1:\n" + student1 + "\n--------------------------------------\n");
		
		
	}

}
