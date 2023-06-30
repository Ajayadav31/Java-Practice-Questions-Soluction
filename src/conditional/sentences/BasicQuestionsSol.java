package conditional.sentences;

class Soluction{
	// Write a Java program that checks if a given number is even or odd.
	public void evenOdd(int number) {
		if(number%2 == 0)
			System.out.println(number + " is Even");
		else if( number < 0)
			System.out.println(number + " is negative");
		else
			System.out.println(number + " is Odd");
	}
	
	// Write a program to find the maximum between two numbers.
	public void maxBitweenTwo(int number1, int number2) {
		if(number1 == number2)
			System.out.println( number1+" and "+number2+" is equal");
		else if(number1 > number2)
			System.out.println(number1+" is grater then "+ number2);
		else
			System.out.println(number2+" is grater then "+number1);
	}
	
	// Write a Java program that checks if a given character is a vowel or a consonant.
	public void checkVowelConsonant(char character) {
		int characterAscii = (int)character;
		
		if(characterAscii >= 65 && characterAscii <= 90 || characterAscii >=97 && characterAscii <= 122) {
			if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'
					||character=='A'||character=='E'||character=='I'||character=='O'||character=='U') {
				System.out.println(character+" is vowel");
			}else {
				System.out.println(character+" is consonant");
			}
		}else {
			System.out.println(character+" is not a character");
		}
	}
	
	// Write a Java program that checks if a given number is positive, negative, or zero.
	public void isPositiveNegativeZero(int number) {
		if(number>1)
			System.out.println(number+" is positive");
		else if(number==0)
			System.out.println(number+" is zero");
		else
			System.out.println(number+" is negative");
	}
	
	// Write a program to convert a given temperature from Celsius to Fahrenheit. 
	//(Celsius to Fahrenheit: (°C × 9/5) + 32 = °F Fahrenheit to Celsius: (°F − 32) x 5/9 = °C)
	public void convertCelsisusToFahrenheit(int celsius) {
		int fahrenheit = (celsius * 9/5) + 32;
		System.out.println(fahrenheit+" F");
	}
	
	// program to check the sign of a given number
	public void signOfNumber(int number) {
		if(number==0)
			System.out.println(number+" has nuteral sign");
		else if(number > 0)
			System.out.println(number+"has positive sign");
		else
			System.out.println(number+" has negative sign");
	}
	
	// program to check whether the triangle is valid or not if angles are given
	public void isTriangleValid(int angle1, int angle2, int angle3) {
		// A triangle is valid if sum of its two sides is greater than the third side.
		// If three sides are a, b and c, then three conditions should be met.
		if(angle1+angle2 <= angle3 || angle2+angle3 <= angle1 || angle1+angle3 <= angle2)
			System.out.println("Invalid Traingle");
		else
			System.out.println("valid Traingle");
	}
	
	// program to check whether a number is divisible by 7 or not
	public void isDivisibleByNumber(int number) {
		if(number%7 == 0)
			System.out.println(number+" is divisible by 7");
		else
			System.out.println(number+" is not divisible by 7");
	}
}


public class BasicQuestionsSol {
	public static void main(String[] args) {
		
		Soluction soluction = new Soluction();
		
//		soluction.evenOdd(-1);
//		soluction.maxBitweenTwo(-12, -23);
//		soluction.checkVowelConsonant('x');
//		soluction.isPositiveNegativeZero(-1);
//		soluction.convertCelsisusToFahrenheit(37);
//		soluction.signOfNumber(0);
//		soluction.isTriangleValid(7, 10, 5);
//		soluction.isTriangleValid(1, 10, 12);
//		soluction.isDivisibleByNumber(50);
		
	}
}
