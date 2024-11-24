import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
    public static void main(String[] args) {
    	//Starting point of code borrowed from Sample Code List APP
    	List<Object> MyList = new ArrayList<>();
    	//Build the list
    	System.out.println("Do you want to create a list? ");
    	String answer = userinput.nextLine();
    	while (answer.equals("Yes")) {
    		System.out.println("Add an item to the list: ");
    		MyList.add(userinput.next());
    		System.out.print("Do you want to continue creating the list? ");
    		answer = userinput.next();
    		userinput.nextLine();
    	}
    	System.out.print("Do you want to edit the list? ");
    	String answer2 = userinput.nextLine();
    	//Allow User to add, remove or edit any item from list
    	while (answer2.equals("Yes") || answer2.equals("yes")) {
    		System.out.print("Would you like to add, subtract, or replace an item? ");
    		String decision = userinput.next();
    		if (decision.equals("add")) {
    			System.out.print("Add an item: ");
    			MyList.add(userinput.next());
    			System.out.print("Would you like to continue editing? ");
    			answer2 = userinput.next();
    		}
    		else if (decision.equals("subtract")) {
    			System.out.print("Subtract an item: ");
    			MyList.remove(userinput.next());
    			System.out.print("Would you like to continue editing? ");
    			answer2 = userinput.next();
    		}
    		//Starting point of code inspired from 
    		//https://www.geeksforgeeks.org/how-to-replace-a-element-in-java-arraylist/
    		else if (decision.equals("replace")) {
    			System.out.print("To replace an item, please enter the indexed value, press enter,"
    					+ " and then enter a replacement for the indexed item.\n");
    			System.out.print(MyList + "\n");
    			MyList.set(userinput.nextInt(), userinput.next());
    			System.out.print("Would you like to continue editing? ");
    			answer2 = userinput.next();
    		}
    	}
    		System.out.print("Your final list: " + MyList);
  	}
}


