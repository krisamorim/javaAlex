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
		
		
	}

}
