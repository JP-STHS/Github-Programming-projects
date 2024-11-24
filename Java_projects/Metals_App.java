import java.util.Scanner;


public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
	//Starting point of code borrowed from Sample Code Temp Converter
	//Temperature Conversion
	static double convertToCelcius (String from, double temp)
        {
           	double answer = temp;
        	if (from.charAt(0) == 'f'){
        		answer = (5.0/9) * (answer - 32); }
        	return answer;
        }
        
        static double convertFromCelcius (String to, double temp)
        {
           	double answer = temp;
        	if (to.charAt(0) == 'f'){
        		answer = (9.0/5) * answer + 32; }
        	return answer;
        }
        
       public static void main(String[] args) {
        double temp;
        double newTemp;
        String fromM,toM;
        String choice = "y";
        System.out.println("Convert a temperature from celcius (c) to fahrenheit (f)");
        while (!(choice.charAt(0) == 'n'))
        {
        	//Get user input to convert
        	System.out.print("\nWhat is the temp? ");
        	temp = userinput.nextDouble();
        	userinput.nextLine();
          	fromM = "c";
          	toM = "f";
          	System.out.print("\n" + temp + " degrees " + fromM + " is ");
          	newTemp = convertFromCelcius(toM, convertToCelcius(fromM, temp));
          	System.out.format("%.1f", newTemp);
         	System.out.print(" degrees " + toM);
          	System.out.print("\nAnother Temp Conversion (y or n)? ");
          	choice = userinput.next();
          	if (choice.equals("n")) {
          		MetalsApp(temp, fromM, toM, newTemp);}
        }
  	}
    //Metals App
    public static void MetalsApp (double temp, String fromM , String toM, double newTemp) {
    	//Get user input for the Metals table
    	System.out.print("How many metals do you want to add? ");
    	int numMetals = userinput.nextInt();
        userinput.nextLine();
        
       	String[][] metalsArray = new String[numMetals][5];
       	for (int i = 0; i < numMetals; i++) {
       		
	       	System.out.print("What is the name of the metal? ");
	       	String name = userinput.next();
	       	userinput.nextLine();
			metalsArray[i][0] = name;
			
	       	System.out.print("What is the density? ");
	       	double density = userinput.nextDouble();
	       	userinput.nextLine();
	       	metalsArray[i][1] = String.valueOf(density);
	       	
	       	System.out.print("What is the melting point in celcius? ");
	       	double melt = userinput.nextDouble();
	       	userinput.nextLine();
	       	temp = melt;
	       	metalsArray[i][2] = String.valueOf(newTemp);
	       	
	       	System.out.print("What is the boiling point in celcius? ");
	       	double boil = userinput.nextDouble();
	       	temp = boil;
	       	metalsArray[i][3] = String.valueOf(newTemp);

	       	userinput.nextLine();
	       	System.out.print("What is the hardness? (1-10) ");
	       	double hardness = userinput.nextDouble();
	       	userinput.nextLine();
	       	metalsArray[i][4] = String.valueOf(hardness);
	       	System.out.print("This metal has been documented!\n");
	       	}
       	//Starting point of code borrowed from https://www.baeldung.com/java-printstream-printf
       	//Display the Metals table
       	System.out.println("Metal Information:");
	        
       	System.out.printf("%-7s %-7s %-7s %-7s %-7s \n", "Name", "Density", "Melting", "Boiling", "Hardness");
	            
	    for (int i = 0; i < numMetals; i++) {
	        System.out.printf("%-7s %-7s %-7s %-7s %-7s \n", metalsArray[i][0], metalsArray[i][1], 
	        		metalsArray[i][2], metalsArray[i][3], metalsArray[i][4]);
	    }
    }
}

