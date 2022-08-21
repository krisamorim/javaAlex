package obj.pcg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	String name, cpf;
	int id;
	List<Discipline> disciplines = new ArrayList<Discipline>();
	
	//setter and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		for (Discipline discipline: disciplines) {
			sumGrade += discipline.getGrade();
		}
		return sumGrade/disciplines.size();
	}
	public String getFinalResult() {
		return getAverage() > 7 ? "Student accredited" : getAverage() > 5 ? "To retake test" : "Fail";
	}
	
	//HashCode and Equals
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
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
		return Objects.equals(cpf, other.cpf);
	}
	
	//To String
	@Override
	public String toString() {
		return "Student: [name=" + name + ", cpf=" + cpf + ", id=" + id + ",\n disciplines=" + disciplines
				+ ",\n getAverage()=" + getAverage() + ",\n getFinalResult()="+ getFinalResult() + "]";
	}
	
	
}
