
public class teste {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[1] = "kris";
		names[2] = "Ana";
		int c = 0;
		
		for (String name : names) {
			System.out.println("[" + c + "]=" + name);
			c++;
		}
		
		System.out.println(names.length);
	}

}
