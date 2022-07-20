package classes;

import java.util.Objects;

public class Discipline {
	double grade;
	String nameDis;
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getDiscipline() {
		return nameDis;
	}
	public void setDiscipline(String discipline) {
		this.nameDis = discipline;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nameDis, grade);
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
		return Objects.equals(nameDis, other.nameDis)
				&& Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade);
	}
	@Override
	public String toString() {
		return "[discipline=" + nameDis + ", grade=" + grade + "]";
	}
	
}
