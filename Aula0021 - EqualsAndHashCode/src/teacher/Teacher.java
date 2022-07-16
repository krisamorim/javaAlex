package teacher;

public class Teacher {
	//variables
	public String name, cpf;
	int id;
	
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
	
	//to String
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", cpf=" + cpf + ", id=" + id + "]";
	}
	
	
}
