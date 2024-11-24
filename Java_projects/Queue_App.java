import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
    public static void main(String[] args) {
    	Queue<String> line1 = new LinkedList<>();
    	Queue<String> line2 = new LinkedList<>();
    	char let = 'A';
    	int time = 0;
    	int time2 = 0;
    	int rn;
    	String person = "" + let + let + let;
    	line1.add(person);
    	
    	while (time < 40 && time2 < 40) {	
    		rn = (int)(Math.random() * 7);
    		if ((rn == 1) || (rn == 2) || (rn == 3)) {let++; person = "" + let + let + let; 
    			if (Math.random() < 0.5) {
    				line1.add(person);
    			}
    			else {
    				line2.add(person);
    			}
    		}
    		if ((rn == 4) || (rn == 4) || (rn == 6)) {
    			if (Math.random() > 0.5) {
    				line1.poll();
    			}
    			else {
    				line2.poll();
    			}
    		}
    		System.out.println("\nQueue 1 Time " + time + " : "  + line1 + "\n");
    		System.out.print("Queue 2 Time " + time2 + " : " + line2 + "\n");
    		time ++;
    		time2 ++;
    	}

    }
}
