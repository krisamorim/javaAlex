package classes;
import classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	String name, peopleRegister;
	int id;
	List<Discipline> disciplines = new ArrayList<Discipline>();
	double average;
	
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
	public List<Discipline> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", peopleRegister=" + peopleRegister + ", id=" + id + ", disciplines="
				+ disciplines + "]";
	}
	
	
}
