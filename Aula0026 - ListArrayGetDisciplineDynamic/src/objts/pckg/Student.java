package objts.pckg;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	String studentName, studentCPF;
	int studentID;
	List<Discipline> disciplines = new ArrayList<Discipline>();
	
	//setters and getters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCPF() {
		return studentCPF;
	}
	public void setStudentCPF(String studentCPF) {
		this.studentCPF = studentCPF;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public List<Discipline> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}
	
	public double getAverage() {
		double sumGrade = 0;
		for(Discipline discipline: disciplines) {
			sumGrade += discipline.getDisciplineGrade();
		}
		return sumGrade/disciplines.size();
	}
	
	//Equals and hashCode
	@Override
	public int hashCode() {
		return Objects.hash(studentCPF);
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
		return Objects.equals(studentCPF, other.studentCPF);
	}
	
	//to String
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCPF=" + studentCPF + ", studentID=" + studentID
				+ ", disciplines=" + disciplines + ", getAverage()=" +getAverage() + "]";
	}
	
	
	
}
