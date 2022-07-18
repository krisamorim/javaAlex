package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//a way to create an array
		int n[] = {3,5,1,2,6,4};
		
		/*
		//creating an array with 5 position
		int num[] = new int[5];
		//fill all position with number 2
		Arrays.fill(num, 2);
		//show array
		for (int valores: num) {
			System.out.println(valores);
		}
		
		
		//a way to print the elements of the an array
		for(int c=0; c<n.length; c++) {
			System.out.println(n[c]);
		}
		*/
		
		//putting in order
		Arrays.sort(n);
		System.out.println("\nIn order:\n");
		for (int valores: n) {
			System.out.println(valores);
		}
		
	}

}
