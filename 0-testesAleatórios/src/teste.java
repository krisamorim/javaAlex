import pcoteTeste.*;

public class teste {
	public static void main(String[] args) {
		
		User[] usuarios = new User[10];
		for(int i = 0; i < 10; i++) {
			User actual = new User("Name"+i,"lastName"+i);
			usuarios[i] = actual;
		}
		
		for(User valores: usuarios) {
			System.out.println(valores);
		}
	}
}
