package arrays;

import java.util.Scanner;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		// arrays -> enhanced for loop / for each loop
		
		Scanner kb = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter elements in an arrays: ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println("Elemts of an arrays is: ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}
}
