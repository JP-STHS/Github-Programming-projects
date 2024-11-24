import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
    public static void main(String[] args) {
    	Map<String,String> LoginMap = new HashMap<>();
    	Map<String,String> MessageMap = new HashMap<>();
    	
    	
    	//Start of code inspired from Sample Code Map implementation
    	//Hardcoding LoginMap
    	LoginMap.put("Mob", "100");
    	LoginMap.put("ShrekWasTaken", "Somebodyoncetoldme");
    	LoginMap.put("Ruff_Ruffman232", "wh0l3tth3d0gs0ut");
    	LoginMap.put("PhineasAlt", "b@dp@ss");
    	LoginMap.put("mememan23", "1n33dth3m3m3s");

    	//Hardcoding MessageMap
    	MessageMap.put("Mob", "yo mob how u doin bro");
    	MessageMap.put("ShrekWasTaken", "JK this is hate mail!!!");
    	MessageMap.put("Ruff_Ruffman232", "Hey john. Did you catch the game last night?");
    	MessageMap.put("PhineasAlt", "did u get the new angry birds game???");
    	MessageMap.put("mememan23", "Can you get us 4 beast burgers this Friday?");
    	
    	System.out.print("Please enter your username: ");
    	String username = userinput.next();
    	System.out.print("Please enter your password: ");
        String password = userinput.next();
        
        // Starting point of code borrowed from
        // https://www.geeksforgeeks.org/hashmap-containskey-method-in-java/
        
    	if (LoginMap.containsKey(username) && LoginMap.get(username).equals(password)) {
    		if (MessageMap.containsKey(username)) {
    			System.out.print("Hello " + username + 
    					", you have mail: " + MessageMap.get(username));
    		}
    	}
    	else {
    		System.out.print("An error occurred.");
    	}
    	    	
  	}
}
