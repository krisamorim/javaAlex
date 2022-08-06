package mainPckg;
import userPckg.*;
import java.util.List;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		
		//creating a new Array list called users
		List<User> users = new ArrayList<>();

		//for to creating 10 users' name like "Nome+number" and last name with "Sobrenome + number"  
		for(int i=0; i<10; i++) {
			
			//creating a new variable to receive the name
			User current = new User("Nome" + i, "Sobrenome" + i);
			
			//adding the new name in to the users variable
			users.add(current);
		}
		
		//print in the console all users from users variable, one by one
		for (User usuario: users) {
			System.out.println(usuario);
		}
		//print all users of the users variable, in a single print
		System.out.println(users);
		
		//get the 1st element (in the position 0)
		System.out.println(users.get(0));
		
		//get only the firstname of the element in the position 2
		System.out.println(users.get(1).getFirstName());
		
		
	}

}
