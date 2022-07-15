import javax.swing.JOptionPane;

public class EqualAndHashcode {

	public static void main(String[] args) {
		//beginning student class
		class Student{
			String name;
			int id;
			double grade1, grade2, grade3, grade4;
			
			//set and get
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
		}
		//end of Student class
		
		//instance student1 variable
		Student student1 = new Student();
		Student student2 = new Student();
		Boolean checkEquals = student1.equals(student2);
		//get the name of the first student
		student1.setName("Anna");
		//get the name of the second student
		student2.setName("Anna");
		Boolean checkEqualsName = student1.name.equals(student2.name);
		
		
				
		//show in the console
		System.out.println("-----------------Comparing objects-----------------\nstudent1: "+student1+"\nstudent2: "+student2+"\nEquals: "+checkEquals);
		//the object comparing is false because java check the memory position
		
		System.out.println("\n-------------Comparing objects' names--------------\nstudent.name: "+student1.name+"\nstudent2.name: "+student2.name+"\nEquals: "+checkEqualsName);
	}

}
