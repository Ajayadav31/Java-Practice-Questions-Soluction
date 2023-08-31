package arrays;

// Arrays are store similer kind of data elemnt at contigous memory location

public class Main {
	public static void main(String[] args) {
		
		// define the arrays
		
		int[] studentData = {101, 102, 103, 104, 105, 785}; // static array 
			
		System.out.println( studentData[0]+" "+studentData[1]+" "+studentData[2]+" "+studentData[3]+" "+studentData[4]);
		
		int[] nums = new int[5]; // dynamic arrays
		
		nums[0] = 78;
		nums[1] = 79;
		nums[2] = 33;
		nums[3] = 98;
		nums[4] = 432;
		
//		System.out.println(nums.length);
		
		for(int i=0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
}
