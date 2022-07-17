package systemclasses;

import java.util.Objects;

public class Discipline {
	String discipline1, discipline2, discipline3, discipline4;
	double grade1, grade2, grade3, grade4;
	
	//setters and getters
	public String getDiscipline1() {
		return discipline1;
	}
	public void setDiscipline1(String discipline1) {
		this.discipline1 = discipline1;
	}
	public String getDiscipline2() {
		return discipline2;
	}
	public void setDiscipline2(String discipline2) {
		this.discipline2 = discipline2;
	}
	public String getDiscipline3() {
		return discipline3;
	}
	public void setDiscipline3(String discipline3) {
		this.discipline3 = discipline3;
	}
	public String getDiscipline4() {
		return discipline4;
	}
	public void setDiscipline4(String discipline4) {
		this.discipline4 = discipline4;
	}
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public double getGrade3() {
		return grade3;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	public double getGrade4() {
		return grade4;
	}
	public void setGrade4(double grade4) {
		this.grade4 = grade4;
	}
	@Override
	public int hashCode() {
		return Objects.hash(discipline1, discipline2, discipline3, discipline4, grade1, grade2, grade3, grade4);
	}
	
	//hashCode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		return Objects.equals(discipline1, other.discipline1) && Objects.equals(discipline2, other.discipline2)
				&& Objects.equals(discipline3, other.discipline3) && Objects.equals(discipline4, other.discipline4)
				&& Double.doubleToLongBits(grade1) == Double.doubleToLongBits(other.grade1)
				&& Double.doubleToLongBits(grade2) == Double.doubleToLongBits(other.grade2)
				&& Double.doubleToLongBits(grade3) == Double.doubleToLongBits(other.grade3)
				&& Double.doubleToLongBits(grade4) == Double.doubleToLongBits(other.grade4);
	}
	
	//To String
	@Override
	public String toString() {
		return "Discipline [discipline1=" + discipline1 + ", discipline2=" + discipline2 + ", discipline3="
				+ discipline3 + ", discipline4=" + discipline4 + ", grade1=" + grade1 + ", grade2=" + grade2
				+ ", grade3=" + grade3 + ", grade4=" + grade4 + "]";
	}

	
	
}
