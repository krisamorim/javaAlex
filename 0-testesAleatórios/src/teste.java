import java.util.ArrayList;
import java.util.List;

import pcoteTeste.*;

class Discipline {
	String name;
	double grade;
	
	
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
	public String toString() {
		return "Discipline [name=" + name + ", grade=" + grade + "]";
	}
	
}

class Student {
	String name, cpf;
	int id;
	List<Discipline> disciplines = new ArrayList<Discipline>();
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", cpf=" + cpf + ", id=" + id + ", disciplines=" + disciplines
				+ ", getAverage()=" + getAverage() + ", getFinalResult()=" + getFinalResult() + "]";
	}
	
	
}
public class teste {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setCpf("Kris");
		student1.setCpf("85989112359");
		student1.setId(1);
		
		Discipline discipline1 = new Discipline();
		Discipline discipline2 = new Discipline();
		Discipline discipline3 = new Discipline();
		Discipline discipline4 = new Discipline();
		discipline1.setName("Math");
		discipline1.setGrade(10);
		student1.getDisciplines().add(discipline1);
		
		discipline2.setName("English");
		discipline2.setGrade(6);
		student1.getDisciplines().add(discipline2);
		
		discipline3.setName("Spanish");
		discipline3.setGrade(6);
		student1.getDisciplines().add(discipline3);
		
		discipline4.setName("Science");
		discipline4.setGrade(8);
		student1.getDisciplines().add(discipline4);
		
		System.out.println(student1.getDisciplines());
		//System.out.println(student1);
		System.out.println(student1.getDisciplines().get(0).name);
	}
}
