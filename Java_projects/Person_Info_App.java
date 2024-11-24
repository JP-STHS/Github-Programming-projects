import java.util.Scanner;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
    //Starting point of code inspired from Sample Code Dog APP
    //Define the person class
    class Person {
    	String firstName, lastName, gender, ethnicity, religion;
    	int age;
    	double weight, height;
    	
    	public Person(String newfirstname, String newlastname, String newGender, String newEthnicity, 
    			String newReligion, int newAge, double newWeight, double newHeight) {
    		this.firstName = newfirstname;
    		this.lastName = newlastname;
    		this.gender = newGender;
    		this.ethnicity = newEthnicity;
    		this.religion = newReligion;
    		this.age = newAge;
    		this.weight = newWeight;
    		this.height = newHeight;
    	}
    }

    //Mainline calls the person class
    public static void main(String[] args) {
    	System.out.print("Would you like to create a person? (yes/no) ");
        String person = userinput.nextLine();
        
        if (person.equals("yes")) {
            System.out.print("What is the person's first name? ");
            String firstName = userinput.nextLine();
            System.out.print("What is the person's last name? ");
            String lastName = userinput.nextLine();
            System.out.print("What is the person's gender? ");
            String gender = userinput.nextLine();
            System.out.print("What is the person's ethnic group? ");
            String ethnicity = userinput.nextLine();
            System.out.print("What is the person's religion? ");
            String religion = userinput.nextLine();
            System.out.print("What is the person's age? ");
            int age = userinput.nextInt();
            userinput.nextLine();
            System.out.print("What is the person's weight? (in pounds) ");
            double weight = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("What is the person's height? (in feet) ");
            double height = userinput.nextDouble();
            userinput.nextLine();
           
            JavaSoundsLikeCoffee javaSoundsLikeCoffee = new JavaSoundsLikeCoffee();
            Person person1 = javaSoundsLikeCoffee.new Person(firstName, lastName, gender, ethnicity, religion, age,
                    weight, height);
            //Print person
            System.out.println("\nCreated Person's Information:");
            System.out.println("First Name: " + person1.firstName);
            System.out.println("Last Name: " + person1.lastName);
            System.out.println("Gender: " + person1.gender);
            System.out.println("Ethnic Group: " + person1.ethnicity);
            System.out.println("Religion: " + person1.religion);
            System.out.println("Age: " + person1.age);
            System.out.println("Weight: " + person1.weight + " pounds");
            System.out.println("Height: " + person1.height + " feet");
        }
        else if (person.equals("no")) {
        	System.out.print("The program is ending");
        }
           
    }
}

