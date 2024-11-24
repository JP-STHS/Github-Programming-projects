import java.util.Scanner;

//Starting point of code borrowed from Sample Code Bicycle APP
class Bicycle {        
    // the Bicycle class has five fields
    public int cadence, gear, speed;
    public String owner, type;
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear, String startType, String startOwner) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.type = startType;
        this.owner = startOwner;
    }
    // the Bicycle class has a method to print information
    public String getInfo (){
    	String message;
    	message = this.owner + " owns this " + this.type + " bicycle.";
    	message += "\nCurrently " + this.owner + " is in gear "+ this.gear + " and going " + this.speed + " MPH.";
    	message += "\nThe cadence is " + this.cadence + " RPM.";
    	return message;
    }
}

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args) {
		//Creating the array
		System.out.print("How many bicycles do you want to define? (1 to 6) ");
		int[] newArray = new int[userinput.nextInt()];
		userinput.nextLine();
		
				
		if (newArray.length >= 1 && newArray.length <= 6) {
			for (int i =0; i < newArray.length; i++) {
			//Printing the bike program
			System.out.print("\nTo define the bike, please enter the cadence, speed, gear, type, and owner (with spaces between each value).\n");
			Bicycle myBike = new Bicycle(userinput.nextInt(), userinput.nextInt(), userinput.nextInt(), userinput.next(), userinput.next());
			userinput.nextLine();
			System.out.println(myBike.getInfo());
			//Giving a suggestion
				if (myBike.type.endsWith("Schwinn") || myBike.type.endsWith("Huffy")) {
					System.out.print("\nHey, " + myBike.owner + " owns a " + myBike.type + "."
							+ " Folks on reddit say to avoid that brand..." );
				}
				if (myBike.cadence < 60) {
					System.out.print("\nThe average cadence for most bikes is 60 RPM. It"
							+ " is recommended that " + myBike.owner + " improves the cadence.");
				}
				if (myBike.speed < 10) {
					System.out.print("\nThe bike is slower than most bikes. " + myBike.owner + " should"
							+ " try seeing if the brakes are broken or if the bike is faulty.");
				}
				
			}
		}
		else {
			System.out.print("Please choose a number between 1 and 6.");
		}
	} 
}

