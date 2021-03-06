import java.util.Objects;
import teacher.*;
import javax.swing.JOptionPane;

public class EqualAndHashcode {

	public static void main(String[] args) {
		//beginning student class - WITH hashCode
		class Student{
			String name, cpf;
			int id;
			double grade1, grade2, grade3, grade4;
			
			//set and get
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
				return getAverage() > 7 ? "aproved" : getAverage() > 5.5 ? "retake test" : "flunked";
			}

			//ToString
			@Override
			public String toString() {
				return "Student [name=" + name + ", id=" + id + ", getCpf()=" + getCpf() + ", grade1=" + grade1 + ", grade2=" + grade2
						+ ", grade3=" + grade3 + ", grade4=" + grade4 + ", getAverage()=" + getAverage()
						+ ", getStatus()=" + getStatus() + "]";
			}
			
			//hashCode start at line 85 and ends at 99
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
			//hashCod end
			
		}
		//end of Student class
		
		//instance objects
		Student student1 = new Student();
		Student student2 = new Student();
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		//check objects
		Boolean checkEquals = student1.equals(student2);
		Boolean checkEqualsTeacher = teacher1.equals(teacher2);
		
		//set the name of the first student
		student1.setName("Anna");
		//set the name of the second student
		student2.setName("Anna");
		//check the student's names
		Boolean checkEqualsName = student1.name.equals(student2.name);
		
		//set the cpf of the first student
		student1.setCpf("123456789");
		//set the cpf of the second student
		student2.setCpf("123456788");
		Boolean checkEqualsCPF = student1.cpf.equals(student2.cpf);
		
		//set the name of the first TEACHER
		teacher1.setName("Elisa");
		//set the name of the second TEACHER
		teacher2.setName("Elisa");
		//check the student's names
		Boolean checkEqualsNameTeacher = teacher1.name.equals(teacher2.name);
				
		//set the cpf of the first TEACHER
		teacher1.setCpf("111111111");
		//set the cpf of the second TEACHER
		teacher2.setCpf("111111111");
		Boolean checkEqualsCPFtechaer = teacher1.cpf.equals(teacher2.cpf);
		
				
		//show in the console
		//the object comparing is true because the hashCOde is implementing in the object
		System.out.println("#Students (With hashCode):\n-----------------Comparing objects-----------------\nstudent1: "+student1+"\nstudent2: "+student2+"\nEquals: "+checkEquals);
		
		//the object comparing now is true because in the code below the NAME are comparing
		System.out.println("\n-------------Comparing objects' names--------------\nstudent.name: "+student1.name+"\nstudent2.name: "+student2.name+"\nEquals: "+checkEqualsName);
	
		
		//the object comparing is false because java check the memory position. even if all the data were the same the result would be false
		System.out.println("\n#Teacher (WithOUT hashCode):\n-----------------Comparing objects-----------------\nteacher1: "+teacher1+"\nteacher2: "+teacher2+"\nEquals: "+checkEqualsTeacher);
		
		//the object comparing now is true because in the code below the NAME are comparing
		System.out.println("\n-------------Comparing objects' names--------------\nteacher2.name: "+teacher1.name+"\nteacher2.name: "+teacher2.name+"\nEquals: "+checkEqualsNameTeacher);
			
	}

}
