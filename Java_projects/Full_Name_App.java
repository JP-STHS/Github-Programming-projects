import java.util.Scanner;
import java.util.Random;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
    public static void main(String[] args) {
    	//fullName method
    	//Start of code borrowed from:
    	//https://stackoverflow.com/questions/3904579/how-to-capitalize-the-first-letter-of-a-string-in-java
    	String firstName = " ".toLowerCase();
    	String cap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    	firstName = cap;
    	String middleName = " ".toUpperCase();
    	cap = middleName.substring(0, 1).toUpperCase();
    	middleName = cap + ".";
    	String lastName = " ".toLowerCase();
    	cap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
    	lastName = cap;
    	String fullName = firstName + " " + middleName + " " + lastName;
    	mainline(firstName, middleName, lastName, fullName, cap);
    }
    static void mainline(String first, String middle, String last, String name, String cap) {
    	System.out.print("Please enter your first, middle, and last name. \n");
    	System.out.print("What is your first name? ");
    	first = userinput.next().toLowerCase();
    	cap = first.substring(0, 1).toUpperCase() + first.substring(1);
    	first = cap;
    	System.out.print("What is your middle name? ");
    	middle = userinput.next().toUpperCase();
    	cap = middle.substring(0, 1).toUpperCase();
    	middle = cap + ".";
    	System.out.print("What is your last name? ");
    	last = userinput.next().toLowerCase();
    	cap = last.substring(0, 1).toUpperCase() + last.substring(1);
    	last = cap;
    	name = first + " " + middle + " " + last;
    	System.out.print(name);    	
    }
  
}
