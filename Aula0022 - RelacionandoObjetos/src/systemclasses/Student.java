package systemclasses;

import java.util.Objects;

public class Student {
	//variables
	String name, peopleRegister;
	int id;
	Discipline discipline = new Discipline();
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPeopleRegister() {
		return peopleRegister;
	}
	public void setPeopleRegister(String peopleRegister) {
		this.peopleRegister = peopleRegister;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	public Discipline getDiscipline() {
		return discipline;
	}
	public double getAveraged() {
		return (discipline.getGrade1()+discipline.getGrade2()+discipline.getGrade3()+discipline.getGrade4())/4;
	}
	public String getStatus() {
		return getAveraged() > 7 ? "Aproved" : getAveraged() > 5.5 ? "Retake test" : "Flunked";
	}
	
	//HashCode people register	
	@Override
	public int hashCode() {
		return Objects.hash(peopleRegister);
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
		return Objects.equals(peopleRegister, other.peopleRegister);
	}
	
	//to String
	@Override
	public String toString() {
		return "Student [name=" + name + ", peopleRegister=" + peopleRegister + ", id=" + id + ", discipline="
				+ discipline + ", getAveraged()=" + getAveraged() + ", getStatus()=" + getStatus() + "]";
	}
	
}
