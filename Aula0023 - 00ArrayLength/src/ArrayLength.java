import java.util.Arrays;

public class ArrayLength {

	public static void main(String[] args) {
		//variable to use in the "for"
		int count = 0;
		//creating a Strin Array
		String[] names = new String[6];
		names[0] = "Ana";
		names[1] = "Kris";
		names[2] = "Samuel";
		names[3] = "Giordana";
		names[4] = "Camila";
		names[5] = "Carmem";
	
		
		//1st way to print all names in the console
		for (String name : names) {
			System.out.println("["+count+"]="+name);
			count++;
		}
		System.out.println('\n');
		
		//2nd way to print all names in the console
		for (int position=0; position < names.length; position++) {
			System.out.println("["+position+"]="+names[position]);
		}
		//just an space
		System.out.println('\n');
		
		//3rd way to print all name in the console
		System.out.println(Arrays.toString(names));
		
		//just an space
		System.out.println('\n');
				
		
		//creating a new array of the type int
		/*int[] numbers = new int[40];
		count = 0;
		for(int number : numbers) {
			numbers[count] = count;
			System.out.println("["+count+"]="+numbers[count]);
			count++;
		}
		System.out.println("The numbers' length is: " + numbers.length);
		*/
	}
}
