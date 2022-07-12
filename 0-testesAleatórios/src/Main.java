import java.io.*;
 
public class Main{

    static int getSum(int n) {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10);
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
       System.out.println(getSum(1234));;
    }
}


/*import pckgSecundario.*;
public class ClassePrincipal {

	public static void main(String[] args) {

		Xpto aluno1 = new Xpto();
		
		Xpto aluno2 = new Xpto("Carla");
		
		aluno2.yearsOld = 50;
		System.out.println(aluno2.name);
		System.out.println(aluno2.yearsOld);
	}

}
*/