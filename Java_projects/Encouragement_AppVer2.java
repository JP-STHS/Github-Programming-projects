
import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		String y;
		
		//Find out the age of the user
		System.out.print("How old are you? ");
		x = userinput.nextInt();
		
		//Find out how the user is feeling
		userinput.nextLine();
		if (x < 18) {
			System.out.print("How are you doing today (Good, Bad, Okay)? ");
			y = userinput.nextLine();
			if (y.equals("Good")) {
				System.out.println("I'm glad your feeling good today! ^_^");
			}
			else if (y.equals("Bad")) {
				System.out.println("Deuteronomy 31:6 states, 'Be strong and courageous. "
						+ "Do not be afraid or terrified because of them, for the Lord your God goes with you;"
						+ " he will never leave you nor forsake you.' When life seems to be getting difficult, remember God will take care of you.");
			}
			else if (y.equals("Okay")) {
				System.out.println("Your just okay? Really?\nSince you chose a mundane answer here's a bad joke:\n"
						+ "Two men walked into a bar, the third man ducked.");
			}
			else {
				System.out.println("Please enter one of the answers provided.");
			}
		}
		else {
			System.out.print("How are you doing today (Good, Bad, Okay)? ");
			y = userinput.nextLine();
			if (y.equals("Good")) {
				System.out.println("Keep on keeping on! ( ͡° ͜ʖ ͡°)");
			}
			else if (y.equals("Bad")) {
				System.out.println("Psalm 48:14, 'For this God is our God for ever and ever;\r\n"
						+ "    he will be our guide even to the end.' If you aren't sure where to go"
						+ " or what to do, the Bible will help you find peace.");
			}
			else if (y.equals("Okay")) {
				System.out.println("Here's a bad joke since you chose the most mundane"
						+ " answer:\nI don't trust stairs, they always lead up to something.");
			}
			else {
				System.out.println("Please enter one of the answers provided.");
			}
	
		}

	}
}
