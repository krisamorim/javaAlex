package obj.pcg;

import java.util.Objects;

public class Discipline {
	String name;
	double grade;
	
	//setter and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	//to String
	@Override
	public String toString() {
		return "Discipline [name=" + name + ", grade=" + grade + "]";
	}
	
}
