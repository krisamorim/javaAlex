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
	}

}
