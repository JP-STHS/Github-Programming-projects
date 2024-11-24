import java.util.Scanner;
import java.util.Stack;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	//Starting point of code borrowed from Sample Code Stack
    	System.out.println ("This simulates an arithmetic stack...");
    	Stack<String> mathstuff = new Stack<>();
    	int answer = 0;
    	String x,y;
    	String item, top;
    	mathstuff.push("Bottom");
    	
    	while (!mathstuff.peek().equals("end")){
    		System.out.print("Next on Stack : ");
    		item = userinput.nextLine();
    		mathstuff.push(item);
    		System.out.println(mathstuff);
    		top = mathstuff.peek();
    		if (top.equals("+") || top.equals("-") || top.equals("*") || top.equals("/")){
    			mathstuff.pop();
    			System.out.println(mathstuff);
    			y = mathstuff.peek();
    			mathstuff.pop();
    			System.out.println(mathstuff);
    			x = mathstuff.peek();
    			mathstuff.pop();
    			System.out.println(mathstuff);
    			if (top.equals("+")) {answer = Integer.parseInt(x) + Integer.parseInt(y);}
    			if (top.equals("-")) {answer = Integer.parseInt(x) - Integer.parseInt(y);}
    			if (top.equals("*")) {answer = Integer.parseInt(x) * Integer.parseInt(y);}
    			if (top.equals("/")) {answer = Integer.parseInt(x) / Integer.parseInt(y);}
    			mathstuff.push("" + answer);
    			System.out.println(mathstuff);
    		}
    	}
    	System.out.println("The program has ended");
    }
}
