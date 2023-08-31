package arrays;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter elements in an arrays: ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println("Elemets of an array is: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
