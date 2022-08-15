package objts.pckg;

import java.util.Objects;

public class Discipline {
	String disciplineName;
	int disciplineID;
	double disciplineGrade;
	
	
	//Setters & Getters
	public String getDisciplineName() {
		return disciplineName;
	}
	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}
	public int getDisciplineID() {
		return disciplineID;
	}
	public void setDisciplineID(int disciplineID) {
		this.disciplineID = disciplineID;
	}
	public double getDisciplineGrade() {
		return disciplineGrade;
	}
	public void setDisciplineGrade(double disciplineGrade) {
		this.disciplineGrade = disciplineGrade;
	}
	
	
	//hashCode & Equals
	@Override
	public int hashCode() {
		return Objects.hash(disciplineID);
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
		return disciplineID == other.disciplineID;
	}
	
	//To String
	@Override
	public String toString() {
		return "Discipline [disciplineName=" + disciplineName + ", disciplineID=" + disciplineID + ", disciplineGrade="
				+ disciplineGrade + "]";
	}
	
	
}
