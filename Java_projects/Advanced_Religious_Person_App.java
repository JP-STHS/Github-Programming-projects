import java.util.Scanner;

//Start of code borrowed from Sample Code Person with Mind and Soul
class Person{
	Scanner userinput = new Scanner(System.in);	 
	private String name="",father="",mother="",gender="", job="", live="";
	private String clothes="";
  	private int height=0,weight=0, age=0, activity=0, hunger=0, thirst=0, income=0;
  	private double latitude=0, longitude=0;
  	private String inMessage="";
  	
  	private void initPerson () {
		//Init Jon Allen Carmen Male Professor BusinessCasual 68 175 53 7 3 5 75000 45.00608 -93.15661
  		System.out.print("Your data:\n");
  		String junk;
		junk = parse();
		System.out.println(junk);
		name = parse();
		System.out.println(name);
		father = parse();
		System.out.println(father);
		mother = parse();
		System.out.println(mother);
		gender = parse();
		System.out.println(gender);
		job = parse();
		System.out.println(job);
		clothes = parse();
		System.out.println(clothes);
		height = Integer.parseInt(parse());
		System.out.println(height);
		weight = Integer.parseInt(parse());
		System.out.println(weight);
		age = Integer.parseInt(parse());
		System.out.println(age);
		activity = Integer.parseInt(parse());
		System.out.println(activity);
		hunger = Integer.parseInt(parse());
		System.out.println(hunger);
		thirst = Integer.parseInt(parse());
		System.out.println(thirst);
		income = Integer.parseInt(parse());
		System.out.println(income);		
		latitude = Double.parseDouble(parse());
		System.out.println(latitude);
		longitude = Double.parseDouble(parse());
		System.out.println(longitude);
		System.out.print("\n--------------------------------------\n");
	}
  	
  	public void inner() {
  		Mind myMind = new Mind();
  		Soul mySoul = new Soul();
  		
  	}
  	
  	public class Mind{
  		private String thought="", state="", intention="", priorities="";
  		protected Mind () {
  			System.out.println("What are you thinking about?");
  			thought = userinput.next();
  			System.out.println("What state of mind are you in?");
  			state = userinput.next();

  			if (state.equals("ANGRY") || state.equals("angry")) {
  				System.out.print("\nCALM DOWN OK \n");
  			}
  			System.out.println("What is your intention at this moment?");
  			intention = userinput.next();
  			//Creating new method
  			System.out.print("What do you prioritize? (pets, friends, family, etc.) ");
  			priorities = userinput.next();
  			if (priorities.equals("dog") || priorities.equals("cat") || priorities.equals("pets")) {
  				System.out.print("Take good care of your " + this.priorities + "!");
  			}
  			if (priorities.equals("family") || priorities.equals("relationships") || priorities.equals("friends")) {
  				System.out.print("I am glad you desire to keep your connections!");
  			}
  			if (priorities.equals("God") || priorities.equals("Jesus")) {
  				System.out.print("Nice answer");
  			}
  			System.out.print("\nAnalyzing your answers, you are in a " + this.state + " state, thinking about " + this.thought + ", and"
  					+ " your intention is " + this.intention + ". \nYou prioritize " + this.priorities + ".");
  			//Final state of mind
  			if (state.equals("angry") && intention.equals("bad")) {
  				System.out.print("\nYou are currently in a bad state of mind.");
  				System.out.print("\nDon't do anything you will regret! You can't turn back time!");
  			}
  			if (state.equals("happy") && intention.equals("good")) {
  				System.out.print("\nYou are currently in a good state of mind.");
  				System.out.print("\nEverybody loves a happy camper.");
  			}
  			if (state.equals("sad") || state.equals("upset") || state.equals("sad")) {
  				System.out.print("\nYou are currently in a sad state of mind.");
  				System.out.print("\n I hope you feel better. :-) \n");
  			}
  			if (this.priorities.equals("myself") || this.priorities.equals("self") || this.priorities.equals("me")) {
  				System.out.print("\nIt's good to care of yourself, but don't become a narcissist!");
  			}
  			
  			System.out.print("\n--------------------------------------\n");
  		}
  	}
  	class Soul{
  	   private String personality ="", religion="";
  	   private Boolean forgiven;
  	   private Boolean communion;
  	   private Boolean trinity;
  	   protected Soul () {
			System.out.println("I am still here!");
			System.out.println("\nWhat is your personality?");
			personality = userinput.next();
			System.out.println("What religion are you?");
			religion = userinput.next();
			System.out.println("Are you forgiven of your sin? (true/false)");
			forgiven = userinput.nextBoolean();
			System.out.println("Do you have a good relationship with God? (true/false)");
			communion = userinput.nextBoolean();
			//Added method
			System.out.print("Do you believe in the trinity? (true/false)");
			trinity = userinput.nextBoolean();
			if (trinity.equals(true)) {
				System.out.print("\nGod is 3 in 1!");
			}
			else if (trinity.equals(false)) {
				System.out.print("\nYou should give this article a read: "
						+ "Don Stewart: Are the Father, Son, and Holy Spirit All Addressed as God?\n");
			}
			System.out.print("\nSoul info: ");
			System.out.print("\nYou have a " + this.personality + " personality.");
			System.out.print("\nYou believe in " + this.religion + ".");
			System.out.print("\nWhen asked if you are forgiven of your sins, you responded " + this.forgiven);
			System.out.print("\nWhen asked if you have a good relationship with God, you responded " + this.communion);
			System.out.print("\nWhen asked if you believe in the trinity, you responded " + this.trinity);
		}   
  	}
	
  	private String parse()
  	{
  		String addto = "";
  		int len;
  		while (!(inMessage.charAt(0) == ' '))
  		{
  			addto += inMessage.charAt(0);
  			inMessage = inMessage.substring(1);
  		}
  		inMessage += " ";
  		inMessage = inMessage.substring(1);
  		return addto;
  	}
  	
	
	public String receiveMessage (String inMessage) {
		this.inMessage = inMessage;
		String outMessage = "[Null]";
		if (inMessage.equals("status1")) {outMessage = status1();}
		else if (inMessage.equals("speak")) {outMessage = speak();} 
		else if (inMessage.substring(0,4).equals("Init")) {initPerson();}
		return outMessage;
	}
	
private String status1() 
{
	String message = "Hi. My name is "+ this.name +".";
	message += "\nI am a " + this.gender + " and am wearing " + this.clothes;
	message += "\nI am at " + this.latitude + " latitude and " + this.longitude + " longitude";
	return message;
}

private String speak(){
	String say = "My name is " + this.name + "\nHi. Nice to meet you.";
	return say;
}
}

class JavaSoundsLikeCoffee {  
    public static void main (String[] args) {
    	Scanner userinput = new Scanner(System.in);	 
    	System.out.println ("Getting Info about You ...");
    	String allinfo = "Init Luke Jordan Maria Male Filmography ShrekCrocs 54 200 23 3 3 5 50000 39.731091 -105.160245";
    	Person person1 = new Person(); 
    	person1.receiveMessage(person1.receiveMessage(allinfo));
		System.out.println(person1.receiveMessage("status1"));
		System.out.print("\n--------------------------------------\n");
		System.out.println(person1.receiveMessage("speak"));
		//Call the inner methods
		person1.inner();
		userinput.close();
		System.out.print("\n***** Thank you for using the person APP. Hope you enjoyed your time here. *****");}}