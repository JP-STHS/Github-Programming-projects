import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	//Starting point of code used from Sample Code io_java__002
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		String s;  // variable type string
		int n;     // variable type integer
		double x;  // variable type double precision decimal with 15 digit precision
		//Starting point of code from https://www.javatpoint.com/how-to-generate-random-number-in-java
		int min = 0;
		int max = 255;
		//Generate random int value from 0 to 255   
		System.out.println("Random value of type int between " + min + " to " + max + ": ");  
		int randomint = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(randomint);  

		//Convert to Binary
		s = Integer.toBinaryString(randomint);
		System.out.println ("In binary, this is: " + s);
		s = userinput.nextLine();
		
		//Convert to Hexadecimal
		s = Integer.toHexString(randomint);
		System.out.println("As a hexadecimal, this is: " + s);
		s = userinput.nextLine();

		//ASCII Character that corresponds to randomint
		//Starting point of code used from https://stackoverflow.com/questions/5328996/java-change-int-to-ascii
		char ch = (char) randomint;
		System.out.println("The ASCII character for random int is: " + ch);
	}
}
