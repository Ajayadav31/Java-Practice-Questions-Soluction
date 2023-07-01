package conditional.sentences;

class SoluctionIntermidiate{
	// Write a program to check if a given year is a leap year.
	public void isleapYear(int year) {
		if(year%4==0 && year%100 != 0 || year%400==0)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
	
	// Write a Java program that finds the largest among three numbers.
	public void largestBitweenThree(int num1, int num2, int num3) {
		int largest = 0;
		if(num1>=num2 && num1>=num3)
			largest = num1;
		else if(num2>=num1 && num2>=num3)
			largest = num2;
		else
			largest = num3;
		System.out.println(largest+" number is largest bitween "+num1+" "+num2+" "+num3);
	}
	
	// Write a Java program that checks if a given number is a prime number.
	public void isPrimeNumber(int number) {
		if(number<1)
			System.out.println("Number is negative");
		else if(number==1)
			System.out.println(number+" is prime number");
		else {
			Boolean flag = true;
			for(byte i=2; i<number/2; i++) {
				if(number%i==0)
					flag = false;
			}
			if(flag)
				System.out.println(number+" is prime number");
			else
				System.out.println(number+" is not prime number");
		}
	}
	
	// Write a program to calculate the grade based on a given percentage. Primary conditions for grade A.
	/*	If marks <50 then Grade is F  
		if marks >=50 <60 then Grade is D 
		if marks >=60 <70 then Grade is C 
		if marks >=70 <80 then Grade is B 
		if marks >=80 <90 then Grade is A 
		if marks >=90 then Grade is A+
	*/
	public void gradeBasedOnPer(int persentage) {
		if(persentage<50)
			System.out.println("grade F");
		else if(persentage>=50 && persentage<60) {
			System.out.println("grade D");
		}else if(persentage>=60 && persentage<70) {
			System.out.println("grade C");
		}else if(persentage>=70 && persentage<80) {
			System.out.println("grade B");
		}else if(persentage>=80 && persentage<90) {
			System.out.println("grade A");
		}else if(persentage>=90) {
			System.out.println("grade A+");
		}
	}
	
	// Write a program to find the maximum among three numbers.
	public void maxBitweenThree(int num1, int num2, int num3) {
		int minimum = 0;
		if(num1<=num2 && num1<=num3)
			minimum = num1;
		else if(num2<=num1 && num2<=num3)
			minimum = num2;
		else
			minimum = num3;
		System.out.println(minimum+" is minimum bitween "+num1+" "+num2+" "+num3);
		
	}
	
	// Check whether the triangle is equilateral, scalene, or isosceles
	public void checkTraingleType(int side1, int side2, int side3) {
		if(side1==side2 && side2==side3)
			System.out.println("equilateral triangle");
		else if(side1==side2 || side2==side3 || side1==side3)
			System.out.println("isosceles triangle");
		else
			System.out.println("scalene triangle");
	}
}

public class IntermidiateQuestionSol {
	public static void main(String[] args) {
		SoluctionIntermidiate soluction = new SoluctionIntermidiate();
//		soluction.isleapYear(2024);
//		soluction.largestBitweenThree(192, 192, 178);
//		soluction.isPrimeNumber(73);
//		soluction.gradeBasedOnPer(97);
//		soluction.maxBitweenThree(12, 12, 12);
//		soluction.checkTraingleType(7, 10, 5);
//		soluction.checkTraingleType(90, 45, 45);
	}
}

