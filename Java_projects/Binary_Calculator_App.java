import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//Starting point for code borrowed from io_java_002
		System.out.print ("Enter the first binary number --> ");
		String binary1 = userinput.nextLine();
		System.out.print ("Enter the second binary number --> ");
		String binary2 = userinput.nextLine();
		
		//Convert binary string to int
		int num1 = Integer.parseInt(binary1,2);
		int num2 = Integer.parseInt(binary2,2);
		//Addition
		int sum = num1 + num2;
		//Division
		int difference = num1 - num2;
		//Multiplication
		int product = num1*num2;
		//Division
		int quotient = num1/num2;
		
		//Results
		System.out.println("The sum of both binary numbers is: " + Integer.toBinaryString(sum));
		userinput.nextLine();
		System.out.println("The difference of both binary numbers is: " + Integer.toBinaryString(difference));
		userinput.nextLine();
		System.out.println("The product of both binary numbers is: " + Integer.toBinaryString(product));
		userinput.nextLine();
		System.out.println("The quotient of both binary numbers is " + Integer.toBinaryString(quotient));

	}
}

