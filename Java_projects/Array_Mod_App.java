import java.util.Arrays;
import java.util.Scanner;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
    	//Starting point of code inspired from class materials, Arrays Class & Sort video
        // Create array
        int[] s = new int[20];

        // Input the contents of the array
        System.out.println("Enter the integers in this array (up to 20):");
        for (int i = 0; i < 20; i++) {
            s[i] = userinput.nextInt();
        }

        // Display the array
        System.out.print("The data is: " + Arrays.toString(s));

        // Edit the values in the array using a while loop
        String choice = "Yes";
        
        //Starting point of code inspired from https://www.educative.io/answers/how-to-retrieve-update-and-delete-an-element-in-a-java-array
        
        while (choice.equals("Yes")) {
            System.out.print("\nDo you want to edit any value? (Yes/No): ");
            choice = userinput.next();

            if (choice.equals("No")) {
                break;
            }

            System.out.print("Enter the index of the value you want to edit: ");
            int index = userinput.nextInt();

            System.out.print("Enter a new value: ");
            int newValue = userinput.nextInt();

            s[index] = newValue;
            
            // Display the updated array
            System.out.println("Updated array: " + Arrays.toString(s));
            
        }

        // Display the array in order from lowest to highest.
        Arrays.sort(s);
        System.out.println("The array from low to high: " + Arrays.toString(s));
    }
}

