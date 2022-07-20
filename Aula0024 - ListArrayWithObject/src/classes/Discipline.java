package classes;

import java.util.Objects;

public class Discipline {
	double grade;
	String discipline;
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	@Override
	public int hashCode() {
		return Objects.hash(discipline, grade);
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
		return Objects.equals(discipline, other.discipline)
				&& Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade);
	}
	@Override
	public String toString() {
		return "Discipline [grade=" + grade + ", discipline=" + discipline + "]";
	}
	
}
