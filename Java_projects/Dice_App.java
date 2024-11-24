import java.util.Scanner;


public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		String play;
		System.out.println("Do you want to roll the dice? (Yes or No) ");
		play = userinput.nextLine();
		while (play.equals("Yes") || play.equals("yes"))  {
			//Starting point for code borrowed
			//from https://stackoverflow.com/questions/26224134/
			int DiceOne = (int) (Math.random()*6+1);
			int DiceTwo = (int) (Math.random()*6+1);
			int Sum = DiceOne + DiceTwo;
			System.out.print("The value for the first dice is " + DiceOne + " and "
					+ "the value for the second dice is " + DiceTwo + ".\n");
			System.out.print("The sum of both numbers is " + Sum + ".\n");
			System.out.println("Do you want to roll the dice again? (Yes or No) ");
			play = userinput.nextLine();
		}
		
	}
}
