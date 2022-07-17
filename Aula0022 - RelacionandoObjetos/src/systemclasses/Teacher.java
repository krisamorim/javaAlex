package systemclasses;

import java.util.Objects;

public class Teacher {
	//variables
	String name, peopleRegister;
	int id;
	
	//getters and setters
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
	
	//hashCode peopleRegister
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
		Teacher other = (Teacher) obj;
		return Objects.equals(peopleRegister, other.peopleRegister);
	}
	
	//to String
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", peopleRegister=" + peopleRegister + ", id=" + id + "]";
	}
		
}
