import java.util.Scanner;

    
  //Starting point of code inspired from Sample Code Dog APP
    //Define the person class

class Person{
    static Scanner userinput = new Scanner(System.in);
	protected String firstName, lastName, gender, ethnicity, religion;
	protected int age;
	protected double weight, height;

	
	public Person(){
        System.out.print("What is the person's first name? ");
        this.firstName = userinput.nextLine();
        System.out.print("What is the person's last name? ");
        this.lastName = userinput.nextLine();
        System.out.print("What is the person's gender? ");
        this.gender = userinput.nextLine();
        System.out.print("What is the person's ethnic group? ");
        this.ethnicity = userinput.nextLine();
        System.out.print("What is the person's religion? ");
        this.religion = userinput.nextLine();
        System.out.print("What is the person's age? ");
        this.age = userinput.nextInt();
        userinput.nextLine();
        System.out.print("What is the person's weight? (in pounds) ");
        this.weight = userinput.nextDouble();
        userinput.nextLine();
        System.out.print("What is the person's height? (in feet) ");
        this.height = userinput.nextDouble();
        userinput.nextLine();

		
	}
	//Getter for getName
	//Starting point of code inspired from:
	//https://www.geeksforgeeks.org/getter-and-setter-in-java/
	//Methods
	public String getName() { return firstName;}
	//Setter/Getter for religion
	public void setReligion(String religion2) {this.religion = religion2;}
	public void greeting(){
		String PersonGreeting = "Hello " + this.firstName + "! Hope you have a good day on campus.";
		System.out.print(PersonGreeting);
	}
	public void prayer() {
		String PersonPrayer = "Dear God, please help " + this.firstName + " while they teach their students and please"
    			+ " help them with anything they or the students"
        		+ " may be struggling with. Please give them peace.";
    	System.out.print(PersonPrayer);
	}
	public void nap() {
		String PersonNap = this.firstName + " is sleeping.";
		System.out.print(PersonNap);

	}
	public void food() {
        String food = "";
        System.out.print("What would you like to feed your person? ");
    	food = userinput.nextLine();
    	double randchoice = Math.random()*6;
        //Eat method overridden to fit a teacher
    	System.out.print("What would you like to feed your person? (salad or soup) ");
        food = userinput.nextLine();
        	
        	if (food.equals("salad")){
        		if (randchoice <= 3) {
        			System.out.print(this.firstName + " enjoyed the " + food);

            	}
            	else {
            		System.out.print(this.firstName + " did not like the " + food);

        	    }
        	}
	}
        	public void religion() {
        		System.out.print("Enter a new religion to replace " + this.religion + ": ");
            	String religion2 = userinput.nextLine();
            	this.setReligion(religion2);
            	System.out.print("Your person's new religion is " + this.religion);
        	}
        	


}
	

//Starting point of code borrowed from Sample Code Animal with Inheritance
//Create the teacher class
class Teacher extends Person{
    static Scanner userinput = new Scanner(System.in);
	protected String subject;
	protected String grade;
	protected String email;

	public Teacher(){		
		System.out.print("What subject is this person teaching? ");
    	this.subject = userinput.nextLine();
    	System.out.print("Which grade is being taught? ");
    	this.grade = userinput.nextLine();
    	System.out.print("Please enter the teacher's email: ");
    	this.email = userinput.nextLine();

	}
	//Getters
	public String getSubject() {return subject;}
	public String getGrade() {return grade;}
	public String getEmail () {return email;}
	//Setters
	public void setSubject(String newSubject) {this.subject = newSubject;}
	public void setGrade(String newGrade) {this.grade = newGrade;}
	public void setEmail(String newEmail) {this.email = newEmail;}
	//Methods
	public void subject() {
		System.out.print("Enter the new subject to be taught instead of " + this.subject + ": ");
        String newTeachingSubject = userinput.nextLine();
        this.setSubject(newTeachingSubject);
        System.out.print("The new class rank is " + this.subject);
	}
	public void grade() {
		System.out.print("Enter the new grade of students to replace " + this.grade + ": ");
        String newTeachingGrade = userinput.nextLine();
        this.setGrade(newTeachingGrade);
        System.out.print("The student's new major is " + this.grade);		
	}
	public void email() {
		System.out.print("Enter the new student email to replace " + this.email + ": ");
        String newTeachingEmail = userinput.nextLine();
        this.setEmail(newTeachingEmail);
        System.out.print("The student's new email is " + this.email);		
	}
	
	
	
	
}

//Mainline
//Starting point of code borrowed from Sample Code Many Animals with Inheritance
public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);

public static void main(String[] args) {
	//Creating teacher array 
	System.out.println("How many Teachers do you want to create?");
	int teacherAmount = userinput.nextInt();
	userinput.nextLine();
	Teacher[] teachArray = new Teacher[teacherAmount];
    int i;	
	for (i = 0;i<teacherAmount;i++)
	{ teachArray[i] = new Teacher();
	

        //Print the info from person
        System.out.println("\nCreated Person's Information:");        
        System.out.println("First Name: " + teachArray[i].firstName);
        System.out.println("Last Name: " + teachArray[i].lastName);
        System.out.println("Gender: " + teachArray[i].gender);
        System.out.println("Ethnic Group: " + teachArray[i].ethnicity);
        System.out.println("Religion: " + teachArray[i].religion);
        System.out.println("Age: " + teachArray[i].age);
        System.out.println("Weight: " + teachArray[i].weight + " pounds");
        System.out.println("Height: " + teachArray[i].height + " feet");
        //Added info from teacher
        System.out.println("Subject: " + teachArray[i].subject);
        System.out.println("Grade teacher is teaching: " + teachArray[i].grade);
        System.out.println("Teacher email: " + teachArray[i].email);
        
	}
        //Teacher APP
		i = 0;
		String continuation = "yes";
        while (continuation.equals("yes")) {
        System.out.print("\nChoose an option:");
        System.out.print("\nGreeting for your person: (1)");
        System.out.print("\nPrayer for your person: (2)");
        System.out.print("\nLet your person take a nap: (3)");
        System.out.print("\nGive your person something to eat: (4)");
        System.out.print("\nYour person's name: (5)");          
        System.out.print("\nChange your person's religion: (6)");
        System.out.print("\nChange the teacher's subject: (7)");
        System.out.print("\nChange the grade the teacher is teaching to: (8)");
        System.out.print("\nChange the teacher's email: (9)");
        System.out.print("\nPick teacher: (10)");
        System.out.print("\nChoice: ");
        
        //Call each method depending on input
        int choose = userinput.nextInt();
        userinput.nextLine();
        if (choose == 1) {
        	teachArray[i].greeting();
        }
        else if (choose == 2) {
        	teachArray[i].prayer();
        }
        else if (choose == 3) {
        	teachArray[i].nap();
        }
        else if (choose == 4) {
        	teachArray[i].food();
        }
        else if (choose == 5) {
        	teachArray[i].getName();
        }
        else if (choose == 6) {
        	teachArray[i].religion();
        }
        else if (choose == 7) {
            teachArray[i].subject();
        }
        else if (choose == 8) {
            teachArray[i].grade();
        }
        else if (choose == 9) {
            teachArray[i].email();
        	
        	}
        else if (choose == 10) {
        	System.out.print("Enter teacher number: ");
        	i = userinput.nextInt();
        	userinput.nextLine();
        }
        //Continue/Finish using the APP
        System.out.print("\nDo you want to continue editing? ");
        continuation = userinput.nextLine();
    }
    //Display all teachers in the teacher array
	for (i = 0; i < teacherAmount; i++) {
        Teacher teacher = teachArray[i]; 
        Person person = teacher;

        System.out.println("Teacher " + (i + 1) + " Information:");
        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Gender: " + person.gender);
        System.out.println("Ethnic Group: " + person.ethnicity);
        System.out.println("Religion: " + person.religion);
        System.out.println("Age: " + person.age);
        System.out.println("Weight: " + person.weight + " pounds");
        System.out.println("Height: " + person.height + " feet");
        System.out.println("Subject: " + teacher.subject);
        System.out.println("Grade teacher is teaching: " + teacher.grade);
        System.out.println("Teacher email: " + teacher.email);
        System.out.println(); //Adds an empty line to separate each teacher
    }
}
}
