import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.JOptionPane;

public class SystemEducation {

	public static void main(String[] args) {
		class Discipline {
			String nameDis;
			int id;
			double grade;
			
			//setter & getters
			public String getNameDis() {
				return nameDis;
			}
			public void setNameDis(String nameDis) {
				this.nameDis = nameDis;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public double getGrade() {
				return grade;
			}
			public void setGrade(double grade) {
				this.grade = grade;
			}
			//hasCode & equals
			@Override
			public int hashCode() {
				return Objects.hash(id, nameDis);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Discipline other = (Discipline) obj;
				return id == other.id && Objects.equals(nameDis, other.nameDis);
			}
			//toString
			@Override
			public String toString() {
				return "[nameDis=" + nameDis + ", id=" + id + ", grade=" + grade + "]";
			}
			
			
		}

		class Student {
			String nameStud, individualRegistration;
			int id;
			List<Discipline> disciplines = new ArrayList<Discipline>();
			
			//setter & getters
			public String getNameStud() {
				return nameStud;
			}
			public void setNameStud(String nameStud) {
				this.nameStud = nameStud;
			}
			public String getIndividualRegistration() {
				return individualRegistration;
			}
			public void setIndividualRegistration(String individualRegistration) {
				this.individualRegistration = individualRegistration;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public List<Discipline> getDisciplines() {
				return disciplines;
			}
			public void setDisciplines(List<Discipline> disciplines) {
				this.disciplines = disciplines;
			}
			public double getAverage() {
				double sumGrade = 0;
				for(Discipline discipline : disciplines) {
					sumGrade += discipline.getGrade();
				}
				return sumGrade/disciplines.size();
			}
			//ToString
			@Override
			public String toString() {
				return "Student [nameStud=" + nameStud + ", individualRegistration=" + individualRegistration + ", id="
						+ id + ", disciplines=" + disciplines + ", getAverage()=" + getAverage() + "]";
			}
			//HashCode & equals
			@Override
			public int hashCode() {
				return Objects.hash(individualRegistration);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Student other = (Student) obj;
				return Objects.equals(individualRegistration, other.individualRegistration);
			}
			
		}
		
		String name = JOptionPane.showInputDialog("What's the student's name?");
		String individualRegistration = JOptionPane.showInputDialog("What's the student's individual registration?");
		int id = Integer.parseInt(JOptionPane.showInputDialog("What's the student's ID?"));
		Student student1 = new Student();
		student1.setNameStud(name);
		student1.setId(id);
		student1.setIndividualRegistration(individualRegistration);
		
		String name1stDis = JOptionPane.showInputDialog("What's the name of the 1st discipline?");
		double grade1stDisc = Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the 1st discipline?"));
		String name2ndDis = JOptionPane.showInputDialog("What's the name of the 2nd discipline?");
		double grade2ndDisc = Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the 2nd discipline?"));
		
		String name3rdDis = JOptionPane.showInputDialog("What's the name of the 3rd discipline?");
		double grade3rdDisc = Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the 3rd discipline?"));
		String name4thDis = JOptionPane.showInputDialog("What's the name of the 4th discipline?");
		double grade4thDisc = Double.parseDouble(JOptionPane.showInputDialog("What's the grade of the 4th discipline?"));
		
		Discipline discipline1 =new Discipline();
		discipline1.setNameDis(name1stDis);
		discipline1.setGrade(grade1stDisc);
		
		Discipline discipline2 =new Discipline();
		discipline2.setNameDis(name2ndDis);
		discipline2.setGrade(grade2ndDisc);
		
		Discipline discipline3 =new Discipline();
		discipline3.setNameDis(name3rdDis);
		discipline3.setGrade(grade3rdDisc);
		
		Discipline discipline4 =new Discipline();
		discipline4.setNameDis(name4thDis);
		discipline4.setGrade(grade4thDisc);
		
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
