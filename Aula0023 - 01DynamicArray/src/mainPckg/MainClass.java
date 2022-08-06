package mainPckg;
import userPckg.*;
import java.util.List;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		for(int i=0; i<10; i++) {
			User current = new User("Nome" + i, "Sobrenome" + i);
			users.add(current);
		}
		
		for (User usuario: users) {
			System.out.println(usuario);
		}
		
		System.out.println(users);
	}

}
