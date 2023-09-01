package arrays;

public class Assignment {

/*
	  	1 - Find the 76 in the given array
      	arr[] = {34,45,342,76,78}

	public static void main(String[] args) {
		int[] arr = {34, 45, 342, 76, 78};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==76)
				System.out.println("Position of 76 in the given arry is : "+i);
		}
	}	
*/
	
	/*
	 2 - Find the largest element in an array
      		arr[] = { 34,45, 564, 6785, 43}
	 */
	
/*      public static void main(String[] args) {
		int[] arr = {34, 45, 564, 6785, 43};
	
				if(arr[0]>arr[1]&&arr[0]>arr[2]&&arr[0]>arr[3]&&arr[0]>arr[4]) {
					System.out.println(arr[0]+" is largest element in array");
			}		
				else if(arr[1]>arr[0]&&arr[1]>arr[2]&&arr[1]>arr[3]&&arr[1]>arr[4]) {
					System.out.println(arr[1]+" is largest element in array");
			}	
				else if(arr[2]>arr[1]&&arr[2]>arr[0]&&arr[2]>arr[3]&&arr[2]>arr[4]) {
					System.out.println(arr[2]+" is largest element in array");
			}
				else if(arr[3]>arr[1]&&arr[3]>arr[2]&&arr[3]>arr[0]&&arr[3]>arr[4]) {
					System.out.println(arr[3]+" is largest element in array");
			}
				else if(arr[4]>arr[1]&&arr[4]>arr[2]&&arr[4]>arr[3]&&arr[4]>arr[0]) {
					System.out.println(arr[4]+" is largest element in array");
			}
				
		}
*/ 	
	
	//Find the smallest element in an array
		//arr[] = {45, 323, 12, 34, 6, 78}
	
/*	 public static void main(String[] args) {
			int[] arr = {45, 323, 12, 34, 6, 78};
		
					if(arr[0]<arr[1]&&arr[0]<arr[2]&&arr[0]<arr[3]&&arr[0]<arr[4]) {
						System.out.println(arr[0]+" is smallest element in array");
				}		
					else if(arr[1]<arr[0]&&arr[1]<arr[2]&&arr[1]<arr[3]&&arr[1]<arr[4]) {
						System.out.println(arr[1]+" is smallest element in array");
				}	
					else if(arr[2]<arr[1]&&arr[2]<arr[0]&&arr[2]<arr[3]&&arr[2]<arr[4]) {
						System.out.println(arr[2]+" is smallest element in array");
				}
					else if(arr[3]<arr[1]&&arr[3]<arr[2]&&arr[3]<arr[0]&&arr[3]<arr[4]) {
						System.out.println(arr[3]+" is smallest element in array");
				}
					else if(arr[4]<arr[1]&&arr[4]<arr[2]&&arr[4]<arr[3]&&arr[4]<arr[0]) {
						System.out.println(arr[4]+" is smallest element in array");
				}
					
			}
*/
//Create a program to calculate the average of elements in an array.
 //   arr[] = { 34,45, 564, 6785, 43}
	
	
/*	public static void main(String[] args) {
		int[] arr = { 34,45, 564, 6785, 43};
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		float avg = sum/arr.length;
		System.out.println("Average of element in array is : " +avg);
	}
*/

//5 - Given an array of integers, write a program to find the sum of all even numbers in the array.
//   arr[] = {34,56,7,97,67,2}
	
/*	public static void main(String[] args) {
		int arr[] = {34,56,7,97,67,2};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				 sum = sum + arr[i];
			}
	    }
		System.out.println("Sum of all even numbers in array is : " + sum);
	}
*/
	
//6 - Write a program to count the occurrences of a 34 in an array.
//    arr[] = {34,56,7,97,67,2, 34, 34, 67, 54, 67}
	
/*	public static void main(String[] args) {
		int[] arr = {34,56,7,97,67,2, 34, 34, 67, 54, 67};
		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==34) {
				sum++;
			}
		}
		System.out.println(sum);
 	}
*/
	
//7 - Implement a program to reverse the elements of an array.
//    arr[] = {1,2,3,4,5,6,7,8,9,10}
	
/*	 public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array : ");
		for (int num : arr) {
	        System.out.print(num + " ");
	    }
		int n = arr.length;
		for(int i = 0; i<n/2;i++) {
			arr[i] = arr[n-1];
			n--;
		}
		System.out.println("\nReverse Array : ");
		for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}
*/
	
//8 - Given two arrays of the same length, write a program to find the dot product of these arrays
//    (sum of the products of corresponding elements).
//    arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    arr2[] = {2, 7, 4, 9, 5, 12, 34, 23, 78, 18}

/*	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = {2, 7, 4, 9, 5, 12, 34, 23, 78, 18};
		int[] dotArray = new int[arr1.length];
		int i = 0;
		int n = 0;
		if(arr1.length==arr2.length) {
			for(int a = 0;i<arr1.length ;i++) {
				dotArray[a] = arr1[i]*arr2[n];
				n++;
				a++;
			}
			System.out.println("DotProduct of Array : ");
			for (int element : dotArray) {
		        System.out.print(element + " ");
		    }
		}
		else {
			System.out.println("Length of both arrays are different so can't take dot product");
		}
	}
*/	
}
		
	
	

