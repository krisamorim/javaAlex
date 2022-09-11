package exec.pkg;
import javax.swing.JOptionPane;

import obj.pkg.Student;

public class Exec {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.setName(JOptionPane.showInputDialog("What's the student name?"));
		student1.setCpf(JOptionPane.showInputDialog("What's the student Individual Registration?"));
		student1.setId(Integer.parseInt(JOptionPane.showInputDialog("What's the student ID?")));
		
		System.out.println("Student data without discipline data: " + student1);
		
		
	}
}
