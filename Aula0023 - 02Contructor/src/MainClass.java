import userPckg.*;

public class MainClass {

	public static void main(String[] args) {
		User[] usuarios = new User[] {
			new User("Krisha", "amorim"),
			new User("Ana","Lucia")
		};
		
		for (User valores: usuarios) {
			System.out.println(valores);
		}
	}

}
