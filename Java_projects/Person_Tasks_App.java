import java.util.Scanner;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
    //Starting point of code inspired from Sample Code Dog APP
    //Define the person class
    class Person {
    	private String firstName, lastName, gender, ethnicity, religion;
    	int age;
    	double weight, height;
    	
    	//Getter for first name
    	//Starting point of code inspired from:
    	//https://www.geeksforgeeks.org/getter-and-setter-in-java/
	    public String getName() { return firstName;}
	   
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
    		setReligion(religion);
    		
    	}
    	//Setter for religion
        public void setReligion(String newReligion) {
    		this.religion = newReligion;
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
           //person1 takes the functions from Person
            JavaSoundsLikeCoffee javaSoundsLikeCoffee = new JavaSoundsLikeCoffee();
            Person person1 = javaSoundsLikeCoffee.new Person(firstName, lastName, gender, ethnicity, religion, age,
                    weight, height);
            //Print person1
            System.out.println("\nCreated Person's Information:");
            System.out.println("First Name: " + person1.firstName);
            System.out.println("Last Name: " + person1.lastName);
            System.out.println("Gender: " + person1.gender);
            System.out.println("Ethnic Group: " + person1.ethnicity);
            System.out.println("Religion: " + person1.religion);
            System.out.println("Age: " + person1.age);
            System.out.println("Weight: " + person1.weight + " pounds");
            System.out.println("Height: " + person1.height + " feet");
            
            String continuation = "yes";
            //Methods
            while (continuation.equals("yes")) {
            System.out.print("\nChoose an option:");
            System.out.print("\nGreeting for your person: (1)");
            String greeting = "Hello " + person1.firstName + "! Hope you are doing well today.";
            System.out.print("\nPrayer for your person: (2)");
            String prayer = "Dear God, please help " + person1.firstName + " with whatever it is that they"
            		+ " are struggling with and please give them peace.";
            System.out.print("\nLet your person take a nap: (3)");
            String nap = person1.firstName + " is sleeping";
            System.out.print("\nGive your person something to eat: (4)");
            String food = "";
            System.out.print("\nYour person's name: (5)");          
            System.out.print("\nChange your person's religion: (6)");
            String religion2 = "";
            System.out.print("\nChoice: ");
            
            //Answers for each mathod
            int choose = userinput.nextInt();
            userinput.nextLine();
            if (choose == 1) {
            	System.out.print(greeting);
            	System.out.print("\nWould you like to choose again? (yes/no) ");
            	continuation = userinput.nextLine();
            }
            else if (choose == 2) {
            	System.out.print(prayer);
            	System.out.print("\nWould you like to choose again? (yes/no) ");
            	continuation = userinput.nextLine();
            }
            else if (choose == 3) {
            	System.out.print(nap);
            	System.out.print("\nWould you like to choose again? (yes/no) ");
            	continuation = userinput.nextLine();
            }
            else if (choose == 4) {
            	System.out.print("What would you like to feed your person? ");
            	food = userinput.nextLine();
            	double randchoice = Math.random()*6;
            	if (randchoice <= 3) {
        			System.out.print(person1 + " enjoyed the " + food);
                	System.out.print("\nWould you like to choose again? (yes/no) ");
                	continuation = userinput.nextLine();
            	}
            	else {
            		System.out.print(person1 + " did not like the " + food);
                	System.out.print("\nWould you like to choose again? (yes/no) ");
                	continuation = userinput.nextLine();
            	}
            }
            else if (choose == 5) {
            	System.out.print("Your person's name is " + person1.getName());
            	System.out.print("\nWould you like to choose again? (yes/no) ");
            	continuation = userinput.nextLine();
            }
            else if (choose == 6) {
            	System.out.print("Enter a new religion to replace " + religion + ": ");
            	religion2 = userinput.nextLine();
            	person1.setReligion(religion2);
            	System.out.print("Your person's new religion is " + person1.religion);
            	System.out.print("\nWould you like to choose again? (yes/no) ");
            	continuation = userinput.nextLine();
            }
            }

            
        }
        else if (person.equals("no")) {
        	System.out.print("The program is ending");
        }
           
    }
}
