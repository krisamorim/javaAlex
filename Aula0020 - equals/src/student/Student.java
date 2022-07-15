package student;

public class Student {
	String name;
	int id, yearBirth;
	double grade1, grade2, grade3, grade4, average;
	String status;
	
	//seters & geters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
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
	public double getAverage() {
		return (this.grade1+this.grade2+this.grade3+this.grade4)/4;
	}
	public String getStatus() {
		return getAverage() > 7 ? "aproved" : getAverage() > 5 ? "retake test" : "flunked";
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yearBirth=" + yearBirth + ", grade1=" + grade1 + ", grade2="
				+ grade2 + ", grade3=" + grade3 + ", grade4=" + grade4 + ", getAverage()=" + getAverage()
				+ ", getStatus()=" + getStatus() + "]";
	}
}
