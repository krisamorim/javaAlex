package obj.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	String name, cpf;
	int id;
	List<Discipline> disciplineList = new ArrayList<Discipline>();
	
	//Setter and getter----------------------------------------------
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
	public List<Discipline> getDisciplineList() {
		return disciplineList;
	}
	public void setDisciplineList(List<Discipline> disciplineList) {
		this.disciplineList = disciplineList;
	}
	
	public double getAverage() {
		double sumGrade = 0;
		for(Discipline discipline: disciplineList) {
			sumGrade += discipline.getGrade();
		}
		return sumGrade/disciplineList.size(); 
	}
	
	public String getFinalResult() {
		return getAverage() > 7 ? "Student accredited" :  getAverage() > 5 ? "To retake test" : "Fail";
	}
	
	//HasCode and equals---------------------------------------------
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
	
	//ToString---------------------------------------------------------
	@Override
	public String toString() {
		return "Student [name=" + name + ", cpf=" + cpf + ", id=" + id + ",\ndisciplineList=" + disciplineList + ",\ngetAverage()=" + getAverage() + ",\n getFinalResult()=" + getFinalResult() + "]";
	}
	
}
