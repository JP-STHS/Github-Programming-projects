import java.util.Scanner;


public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		//Get a value for x
		System.out.print("What should the value for x be? ");
		x = userinput.nextInt();
		userinput.nextLine();
		
		//If x is greater than 0
		if (x < 0) {
			System.out.print("The new value of x is ");
			System.out.print(3 * x + 7);
		}
		//If 0 is less than or equal to x and is x is less than or equal to 10
		else if (0 <= x && x <= 10) {
			int ExponentStuff = (int) Math.pow(x, 2);
			System.out.print("The new value of x is ");
			System.out.print(ExponentStuff + 8);
		}
		//If x is greater than 10
		else if (x > 10) {
			int FirstExponent = (int) Math.pow(x, 3);
			int SecondExponent = (int) Math.pow(x, 2);
			System.out.print("The new value of x is ");
			System.out.print(FirstExponent - (6 * SecondExponent));
		}
		
	}
}
