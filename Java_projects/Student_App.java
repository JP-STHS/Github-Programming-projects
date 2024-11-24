import java.util.Scanner;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
  //Starting point of code inspired from Sample Code Dog APP
    //Define the person class

class Person{
	protected String firstName, lastName, gender, ethnicity, religion;
	protected int age;
	protected double weight, height;

	
	public Person(){
		this.firstName = "";
		this.lastName = "";
		this.gender = "";
		this.ethnicity = "";
		this.religion = "";
		this.age = 0;
		this.weight = 0;
		this.height = 0;
		
	}
	//Getter for getName
	//Starting point of code inspired from:
	//https://www.geeksforgeeks.org/getter-and-setter-in-java/
	public String getName() { return firstName;}
	//Setter/Getter for religion
	public void setReligion(String religion2) {this.religion = religion2;}
	



}

//Starting point of code borrowed from Sample Code Animal with Inheritance
class Student extends Person{
	private String major;
	private String ClassRank;
	private String StudentEmail;
	
	public Student(){		
		this.major = "";
		this.ClassRank = "";
		this.StudentEmail = "";

	}
	//Getters
	public String getMajor() {return major;}
	public String getClassRank() {return ClassRank;}
	public String StudentEmail () {return StudentEmail;}
	//Setters
	public void setMajor(String newMajor) {this.major = newMajor;}
	public void setClassRank(String newClassRank) {this.ClassRank = newClassRank;}
	public void setStudentEmail(String newStudentEmail) {this.StudentEmail = newStudentEmail;}
	
}

//Mainline calls the person class
public static void main(String[] args) {
	System.out.print("Would you like to create a Person? (yes/no) ");
    String person = userinput.nextLine();
    
    JavaSoundsLikeCoffee javaSoundsLikeCoffee = new JavaSoundsLikeCoffee();
    Person person1 = javaSoundsLikeCoffee.new Person();
    Student student1 = javaSoundsLikeCoffee.new Student();
    
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
        System.out.print("Is the person a student? (yes/no) ");
        String studentAnswer = userinput.nextLine();
        if (studentAnswer.equals("yes")) {
        	
        	System.out.print("What is the student majoring in? ");
        	String StudentMajor = userinput.nextLine();
        	System.out.print("What is the student's class rank? ");
        	String StudentClassRank = userinput.nextLine();
        	System.out.print("Please enter the student email: ");
        	String inputStudentEmail = userinput.nextLine();
            student1.major = StudentMajor;
            student1.ClassRank = StudentClassRank;
            student1.StudentEmail = inputStudentEmail;


        	
        }
        else if (studentAnswer.equals("no")) {
        	System.out.print("Skipping the student questions!");
        }
        
        //Defining the student
        
       //person1 takes the functions from Person

        //Print person1
        System.out.println("\nCreated Person's Information:");
        person1.firstName = firstName;
        System.out.println("First Name: " + person1.firstName);
        person1.lastName = lastName;
        System.out.println("Last Name: " + person1.lastName);
        person1.gender = gender;
        System.out.println("Gender: " + person1.gender);
        person1.ethnicity = ethnicity;
        System.out.println("Ethnic Group: " + person1.ethnicity);
        person1.religion = religion;
        System.out.println("Religion: " + person1.religion);
        person1.age = age;
        System.out.println("Age: " + person1.age);
        person1.weight = weight;
        person1.height = height;
        System.out.println("Weight: " + person1.weight + " pounds");
        System.out.println("Height: " + person1.height + " feet");
        if (studentAnswer.equals("yes")) {
        	System.out.println("Student major: " + student1.major);
            System.out.println("Student class rank: " + student1.ClassRank);
            System.out.println("Student email: " + student1.StudentEmail);
        }
        
        
        String continuation = "yes";
        //Methods
        while (continuation.equals("yes")) {
        System.out.print("\nChoose an option:");
        System.out.print("\nGreeting for your person: (1)");
        String greeting;
        if (studentAnswer.equals("yes")) {
        	greeting = "Hello " + person1.firstName + "! Hope you have a good day on campus.";
        }
        else {
        	greeting = "Hello " + person1.firstName + "! Hope you are doing well today.";
        }
        System.out.print("\nPrayer for your person: (2)");
        String prayer;
        if (studentAnswer.equals("yes")) {
        	prayer = "Dear God, please help " + person1.firstName + " with their studies and anything that they"
            		+ " may be struggling with. Please give them peace.";
        }
        else {
        	prayer = "Dear God, please help " + person1.firstName + " with whatever it is that they"
            		+ " may be struggling with and please give them peace.";
        }
        System.out.print("\nLet your person take a nap: (3)");
        String nap = person1.firstName + " is sleeping.";
        System.out.print("\nGive your person something to eat: (4)");
        String food = "";
        System.out.print("\nYour person's name: (5)");          
        System.out.print("\nChange your person's religion: (6)");
        if (studentAnswer.equals("yes")) {
            System.out.print("\nChange the student's class rank: (7)");
            System.out.print("\nChange the student's major: (8)");
            System.out.print("\nChange the student's email: (9)");
        }
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
        	double randchoice = Math.random()*6;
        	if (studentAnswer.equals("yes")) {
            	//Eat method overridden to fit a student
        		System.out.print("What would you like to feed your person? (burger or soup) ");
            	food = userinput.nextLine();
            	
            	if (food.equals("burger")){
            		if (randchoice <= 3) {
            			System.out.print(student1.firstName + " enjoyed the " + food);
                    	System.out.print("\nWould you like to choose again? (yes/no) ");
                    	continuation = userinput.nextLine();
                	}
                	else {
                		System.out.print(student1.firstName + " did not like the " + food);
                    	System.out.print("\nWould you like to choose again? (yes/no) ");
                    	continuation = userinput.nextLine();
            	}
            	
            	}
            	if (food.equals("soup")) {
            		if (randchoice <= 3) {
            			System.out.print(student1.firstName + " enjoyed the " + food);
                    	System.out.print("\nWould you like to choose again? (yes/no) ");
                    	continuation = userinput.nextLine();
                	}
                	else {
                		System.out.print(student1.firstName + " did not like the " + food);
                    	System.out.print("\nWould you like to choose again? (yes/no) ");
                    	continuation = userinput.nextLine();
            	}
            	}
        	}
        	else {
        		System.out.print("What would you like to feed your person? ");
            	food = userinput.nextLine();
            	if (randchoice <= 3) {
        			System.out.print(person1.firstName + " enjoyed the " + food);
                	System.out.print("\nWould you like to choose again? (yes/no) ");
                	continuation = userinput.nextLine();
            	}
            	else {
            		System.out.print(person1.firstName + " did not like the " + food);
                	System.out.print("\nWould you like to choose again? (yes/no) ");
                	continuation = userinput.nextLine();
            		}
        	
        		}
        }
        else if (choose == 5) {
        	System.out.print("Your person's name is " + person1.getName());
        	System.out.print("\nWould you like to choose again? (yes/no) ");
        	continuation = userinput.nextLine();
        }
        else if (choose == 6) {
        	System.out.print("Enter a new religion to replace " + person1.religion + ": ");
        	String religion2 = userinput.nextLine();
        	person1.setReligion(religion2);
        	System.out.print("Your person's new religion is " + person1.religion);
        	System.out.print("\nWould you like to choose again? (yes/no) ");
        	continuation = userinput.nextLine();
        }
        else if (choose == 7) {
            System.out.print("Enter the new class rank instead of " + student1.ClassRank + ": ");
            String newClassRank = userinput.nextLine();
            student1.setClassRank(newClassRank);
            System.out.print("The new class rank is " + student1.ClassRank);
            System.out.print("\nWould you like to choose again? (yes/no) ");
        	continuation = userinput.nextLine();
        }
        else if (choose == 8) {
            System.out.print("Enter the new class major to replace " + student1.major + ": ");
            String newMajor = userinput.nextLine();
            student1.setClassRank(newMajor);
            System.out.print("The student's new major is " + student1.major);
            System.out.print("\nWould you like to choose again? (yes/no) ");
        	continuation = userinput.nextLine();
        }
        else if (choose == 9) {
            System.out.print("Enter the new student email to replace " + student1.StudentEmail + ": ");
            String newStudentHandle = userinput.nextLine();
            student1.setClassRank(newStudentHandle);
            System.out.print("The student's new email is " + student1.StudentEmail);
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


