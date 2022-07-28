
public class ArrayLeson {

	public static void main(String[] args) {
		
		//instanciando um objeto com 10 posições
		User[] users = new User[10];
		
		for(int i=0; i < users.length; i++) {
			User actual = new User();
			actual.setFirstName("Name"+i);
			actual.setLastName("LastName"+i);
			users[i] = actual;
			
			System.out.println("User "+i+": "+users[i]);
		}
		
	}

}
