package exec.pkg;
import javax.swing.JOptionPane;
import obj.pkg.*;
import java.util.ArrayList;
import java.util.List;

public class Exec {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		
		int studentsAmount = Integer.parseInt(JOptionPane.showInputDialog("How many students do you want to add?"));
		
		for (int count=0;count<studentsAmount;count++) {
			Student student1 = new Student();
			int continueDiscipline = 1;
			
			JOptionPane.showMessageDialog(null, "Let's start with Student's data");
			
			student1.setName(JOptionPane.showInputDialog("What's the student name?"));
			student1.setCpf(JOptionPane.showInputDialog("What's the student Individual Registration?"));
			student1.setId(Integer.parseInt(JOptionPane.showInputDialog("What's the student ID?")));
			
			System.out.println("Student data without discipline data: " + student1);
			
			JOptionPane.showMessageDialog(null, "Now let's type the discipline data");
			
			while (continueDiscipline == 1) {
			int i = student1.getDisciplineList().size()+1;
				for (;i<5;i++) {
					Discipline disciplineVariable = new Discipline();
					disciplineVariable.setName(JOptionPane.showInputDialog("What's the name of the discipline number " + i + "?"));
					disciplineVariable.setGrade(Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the discipline number " + i + "?")));
					System.out.println(disciplineVariable);
					student1.getDisciplineList().add(disciplineVariable);
					
				}
				
				int choiceRemove = JOptionPane.showConfirmDialog(null, "Do want to remove a discipline?");
				System.out.println(choiceRemove);
				
				while (choiceRemove != 1) {
					int choiceDiscipline = 4;
					if (student1.getDisciplineList().size() == 4) {
						choiceDiscipline = Integer.parseInt(JOptionPane.showInputDialog("Wich one?:\n1 to remove " + student1.getDisciplineList().get(0).getName() + "\n2 to remove " + student1.getDisciplineList().get(1).getName() + "\n3 to remove " + student1.getDisciplineList().get(2).getName() + "\n4 to remove " + student1.getDisciplineList().get(3).getName()));
					} else if (student1.getDisciplineList().size() == 3) {
						choiceDiscipline = Integer.parseInt(JOptionPane.showInputDialog("Wich one?:\n1 to remove " + student1.getDisciplineList().get(0).getName() + "\n2 to remove " + student1.getDisciplineList().get(1).getName() + "\n3 to remove " + student1.getDisciplineList().get(2).getName()));
					} else if (student1.getDisciplineList().size() == 2) {
						choiceDiscipline = Integer.parseInt(JOptionPane.showInputDialog("Wich one?:\n1 to remove " + student1.getDisciplineList().get(0).getName() + "\n2 to remove " + student1.getDisciplineList().get(1).getName()));
					} else if (student1.getDisciplineList().size() == 1) {
						choiceDiscipline = Integer.parseInt(JOptionPane.showInputDialog("Type 1 to remove " + student1.getDisciplineList().get(0).getName()));
					}
					
					student1.getDisciplineList().remove(choiceDiscipline -1 );
					//if discipline list isn't empty ask to remove
					if (student1.getDisciplineList().size() != 0) {
						choiceRemove = JOptionPane.showConfirmDialog(null, "Do want to remove another?");
					} else {
						//if discipline list is empty then to quit the "while loop"
						choiceRemove = 1;
					} 
				}
				//----------end of the remove while---------------
				
				
				//if discipline list is full quit the while to add list
				if (student1.getDisciplineList().size() == 4) {
					continueDiscipline = 0;
				}
				
			}
			//end of the while to add discipline
			
			//show the result
			String firstDisciplineAdnGrade = student1.getDisciplineList().get(0).getName() + " grade:" + student1.getDisciplineList().get(0).getGrade();
			String secondDisciplineAdnGrade = student1.getDisciplineList().get(1).getName() + " grade:" + student1.getDisciplineList().get(1).getGrade();
			String  thirthDisciplineAdnGrade = student1.getDisciplineList().get(2).getName() + " grade:" + student1.getDisciplineList().get(2).getGrade();
			String fourthDisciplineAdnGrade = student1.getDisciplineList().get(3).getName() + " grade:" + student1.getDisciplineList().get(3).getGrade();
			JOptionPane.showMessageDialog(null, "The " + student1.getName() + "'s grade are:\n" + firstDisciplineAdnGrade + "\n" + secondDisciplineAdnGrade + "\n" + thirthDisciplineAdnGrade + "\n" + fourthDisciplineAdnGrade);
			JOptionPane.showMessageDialog(null, "The student average is " + student1.getAverage() + "\n" + student1.getFinalResult());
			
			studentList.add(student1);			
		}
		
		int seeStudentData = JOptionPane.showConfirmDialog(null, "Do you want to see some student information?");
		
		if (seeStudentData == 0) {
			int choiceSeeStudentData = Integer.parseInt(JOptionPane.showInputDialog("Wich one? Type:\n1 to " + studentList.get(0).getName() + "\n2 to " + studentList.get(1).getName()));
			
			JOptionPane.showMessageDialog(null, studentList.get(choiceSeeStudentData));
		}
	}
}
