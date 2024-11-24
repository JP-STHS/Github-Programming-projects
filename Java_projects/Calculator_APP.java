import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		double x;
		double y;
		//Starting point for code borrowed from example_inputs_001 Sample Code
		System.out.print("Enter a value for x: ");
		x = userinput.nextDouble();  // this illustrates user input
		userinput.nextLine();
		System.out.println("The inputed value for x is: " + x);
		
		System.out.print("Enter a value for y: ");
		y = userinput.nextDouble();  // this illustrates user input
		userinput.nextLine();
		System.out.println("The inputed value for y is: " + y);
		//Addition
		double sum = x + y;
		System.out.println("The sum of x + y is: " + sum);
		userinput.nextLine();
		//Multiplication
		double product = x*y;
		System.out.println("The product of xy is: " + product);
		userinput.nextLine();
		//Division
		double quotient = x/y;
		System.out.println("The quotient of x/y is: " + quotient);
		userinput.nextLine();
		//Exponents
		double exponent = Math.pow(x, y);
		System.out.println("x to the power of y equals : " + exponent);
		userinput.nextLine();
	}
}
