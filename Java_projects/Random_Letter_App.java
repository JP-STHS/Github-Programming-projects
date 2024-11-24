import java.util.Scanner;
import java.util.Random;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
    public static void main(String[] args) {
    	//Start of code inspired from:
    	//https://www.w3schools.com/java/java_break.asp
        String word = "";
        //Create word
        while (true) {
            System.out.print("Enter a string: ");
            word = userinput.next();
            
            if (word.length() >= 5 && word.length() <= 20) {
                break;
            } else {
                System.out.println("Please make sure your string is more "
                		+ "than 5 characters and less than 20!");
            }
        }
        //Print the edited word
        for (int i = 1; i < 11; i++) {
            word = update(word);
            System.out.println("Word #" + i + ": " + word);
        }
    }
    
    public static String update(String word) {
    	//Start of code inspired from:
    	//https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java
        Random random = new Random();
        int index = random.nextInt(word.length());
        
        char[] letters = word.toCharArray();
        //newLetter variable replaces a letter in word with a random letter from the alphabet.
        char newLetter = (char) (random.nextInt(26) + 'a');
        
        letters[index] = newLetter;
        
        return new String(letters);
    }
}

