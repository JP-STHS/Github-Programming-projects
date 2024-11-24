import java.util.Scanner;

//Create the vehicle interface
interface Vehicle {
	int gear = 0;
	int speed = 0;
	String owner = "";
	String type = "";
	
	
	void speedUp(int a);
	void slowDown(int a);
	void changeGear(int a);
	void getInfo(String a);
}

//Create the car class
class Car implements Vehicle {
	protected int gear = 0;
	protected int speed = 0;
	protected String CarOwner = "";
	protected String CarType = "";
	//Method exclusive to car class
  protected int SeatNum = 0;

	public void speedUp(int a) {
		this.speed += a;
	}
	public void slowDown(int a) {
		this.speed -= a;
	}
	public void changeGear(int a) {
		this.gear = a;
	}
	public void getInfo(String a) {
		this.CarOwner = a;
		this.CarType = a;
	}
	public void getSeats(int a) {
		this.SeatNum = a;
	}
}

//Create the bicycle class
class Bicycle implements Vehicle {
	protected int gear = 0;
	protected int speed = 0;
	protected String BikeOwner = "";
	protected String BikeType = "";
	//method exclusive to bicycle class
	protected String TireType = "";

	public void speedUp(int a) {
		this.speed += a;
	}
	public void slowDown(int a) {
		this.speed -= a;
	}
	public void changeGear(int a) {
		this.gear = a;
	}
	public void getInfo(String a) {
		this.BikeOwner = a;
		this.BikeType = a;
	}
	public void getTireType(String a) {
		this.TireType = a;
	}
}

//Start of mainline
class JavaSoundsLikeCoffee {  
    public static void main (String[] args) {
    	Scanner userinput = new Scanner(System.in);
    	//Choose which class to instantiate
    	System.out.print("Which class do you want to instantiate? (bike/car) ");
    	String choice = userinput.nextLine();
    	if (choice.equals("bike")) {
    		Bicycle bike = new Bicycle();
    		System.out.print("How fast should the bike be going? ");
    		bike.speed = userinput.nextInt();
    		userinput.nextLine();
    		System.out.print("What gear is the bike in? ");
    		bike.gear = userinput.nextInt();
    		userinput.nextLine();
    		System.out.print("Who is the bike owner? ");
    		bike.BikeOwner = userinput.nextLine();
    		System.out.print("What is the bike type? ");
    		bike.BikeType = userinput.nextLine();
    		System.out.print("What is the tire type? ");
    		bike.TireType = userinput.nextLine();
    		//Display bike info
    		System.out.print("-----Bicycle Info-----\n");
    		System.out.print("Bike speed: " + bike.speed);
    		System.out.print("\nCurrent gear: " + bike.gear);
    		System.out.print("\nOwner: " + bike.BikeOwner);
    		System.out.print("\nType: " + bike.BikeType);
    		System.out.print("\nTires: " + bike.TireType);
    		//Allow user to change methods
    		System.out.print("\nDo you want to change any methods? (yes/no)");
    		choice = userinput.nextLine();
    		if (choice.equals("yes")) {
    			System.out.print("Choose a method: Speed (1), Gear (2), Owner (3), Type (4), Tires (5) ");
    			choice = userinput.nextLine();
    			if (choice.equals("1")) {
    				System.out.print("Is the bike speeding up or slowing down? (up/down)");
    				choice = userinput.nextLine();
    				if (choice.equals("up")) {
    					System.out.print("How much is the bike speeding up? ");
    					bike.speedUp(userinput.nextInt());
    					userinput.nextLine();
    				}
    				if (choice.equals("down")) {
    					System.out.print("How much is the bike slowing up? ");
    					bike.slowDown(userinput.nextInt());
    					userinput.nextLine();
    				}
    				System.out.print("The new bike speed is: " + bike.speed);
    			}
    			if (choice.equals("2")) {
    				System.out.print("What gear is the bike in? ");
    				bike.changeGear(userinput.nextInt());
    				userinput.nextLine();
    				System.out.print("The bike is now in gear " + bike.gear);
    			}
    			if (choice.equals("3")) {
    				System.out.print("Who is the new bike owner?");
    				bike.getInfo(userinput.nextLine());
    				System.out.print("New Owner: " + bike.BikeOwner);
    			}
    			if (choice.equals("4")) {
    				System.out.print("What is the bike type?");
    				bike.getInfo(userinput.nextLine());
    				System.out.print("New bike type: " + bike.BikeType);
    			}
    			if (choice.equals("5")) {
    				System.out.print("What is the tire type?");
    				bike.getTireType(userinput.nextLine());
    				System.out.print("New Tire type: " + bike.TireType);
    			}
    			
    			}
    		}
    	if (choice.equals("car")) {
    		Car car = new Car();
    		System.out.print("How fast should the car be going? ");
    		car.speed = userinput.nextInt();
    		userinput.nextLine();
    		System.out.print("What gear is the car in? ");
    		car.gear = userinput.nextInt();
    		userinput.nextLine();
    		System.out.print("Who is the car owner? ");
    		car.CarOwner = userinput.nextLine();
    		System.out.print("What is the car type? ");
    		car.CarType = userinput.nextLine();    	
    		System.out.print("How many seats are in the car? ");
    		car.SeatNum = userinput.nextInt();   
    		userinput.nextLine();
    		//Display car info
    		System.out.print("-----Car Info-----\n");
    		System.out.print("Car speed: " + car.speed);
    		System.out.print("\nCurrent gear: " + car.gear);
    		System.out.print("\nOwner: " + car.CarOwner);
    		System.out.print("\nType: " + car.CarType);
    		System.out.print("\nSeats: " + car.SeatNum);
    		//Allow user to change Car methods
    		System.out.print("\nDo you want to change any methods? (yes/no)");
    		choice = userinput.nextLine();
    		if (choice.equals("yes")) {
    			System.out.print("Choose a method: Speed (1), Gear (2), Owner (3), Type (4), Seats (5) ");
    			choice = userinput.nextLine();
    			if (choice.equals("1")) {
    				System.out.print("Is the car speeding up or slowing down? (up/down)");
    				choice = userinput.nextLine();
    				if (choice.equals("up")) {
    					System.out.print("How much is the car speeding up? ");
    					car.speedUp(userinput.nextInt());
    					userinput.nextLine();
    				}
    				if (choice.equals("down")) {
    					System.out.print("How much is the car slowing up? ");
    					car.slowDown(userinput.nextInt());
    					userinput.nextLine();
    				}
    				System.out.print("The new car speed is: " + car.speed);
    			}
    			if (choice.equals("2")) {
    				System.out.print("What gear is the car in? ");
    				car.changeGear(userinput.nextInt());
    				userinput.nextLine();
    				System.out.print("The car is now in gear " + car.gear);
    			}
    			if (choice.equals("3")) {
    				System.out.print("Who is the new car owner?");
    				car.getInfo(userinput.nextLine());
    				System.out.print("New Owner: " + car.CarOwner);
    			}
    			if (choice.equals("4")) {
    				System.out.print("What is the car type?");
    				car.getInfo(userinput.nextLine());
    				System.out.print("New car type: " + car.CarType);
    			}
    			if (choice.equals("5")) {
    				System.out.print("What is the number of seats?");
    				car.getSeats(userinput.nextInt());
    				userinput.nextLine();
    				System.out.print("New seat amount: " + car.SeatNum);
    			}
    			
    			}
    		}
    	//Graceful exit
    	System.out.print("\nThe program has ended.");
    	
    }
}

