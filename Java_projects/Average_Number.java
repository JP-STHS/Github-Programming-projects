import java.util.ArrayList;
import java.util.Scanner;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
    //Starting point of code borrowed from:
    //https://www.javatpoint.com/java-calculate-average-of-list
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();    
    	//adding elements to the List
    	double sum = 0;
    	list.add(1);  
    	list.add(2);  
    	list.add(3);  
    	list.add(4);  
    	list.add(100);  
    	//loop iterates over the List  
    	for(int i = 0; i < list.size(); i++) {
    	//getting elements from the list and adding to the variable sum   
    	sum = sum + list.get(i); 
    	}
    	//finds the average of the list  
    	double avg = sum / list.size();   
    	//prints the result  
    	System.out.println("The average of the List: " + avg);
    	
    	InputStuff(avg, sum, args);
  	}  

    public static void InputStuff(double avg, double sum, String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("How many numbers in the new list?  ");
        int count = userinput.nextInt();

        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < count; i++) {
            int num = userinput.nextInt();
            list.add(num);
        }

        sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        avg = sum / list.size();

        System.out.println("The average of the List: " + avg);
    
    }
}  

