import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	String answer;
    	
    	//Starting point of code used from Sample Code Set Implementation
    	//Initialize the set
    	Set<String> MySet = new HashSet <String>();
    	//Add one element to the set
    	System.out.println("Add one element to the set: ");
    	MySet.add(userinput.nextLine());
    	
    	//Add or delete elements from the set
    	System.out.println("Do you want to add or subtract elements from the set? (Yes/No) ");
    	answer = userinput.nextLine();
    	while(answer.equals("Yes")) {
        	System.out.println("Do you want to add or subtract? ");
        	String OperationTime = userinput.nextLine();
        	if (OperationTime.equals("add")) {
        		System.out.println("What element would you like to add? ");
        		MySet.add(userinput.next());
        		System.out.print("Do you want to continue adding or subtract? (Yes/No) ");
        		answer = userinput.next();
        	}
        	else if (OperationTime.equals("subtract")) {
        		System.out.println(MySet);
        		System.out.println("Which element would you like to subtract? ");
        		MySet.remove(userinput.next());
        		System.out.print("Do you want to continue adding or subtract? (Yes/No) ");
        		answer = userinput.next();
        	}
        	
    	}
        System.out.print(MySet);
    }
}
