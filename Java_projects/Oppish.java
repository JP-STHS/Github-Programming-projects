import java.util.Scanner;

public class JavaSoundsLikeCoffee {
    static Scanner userinput = new Scanner(System.in);
    
    public static void main(String[] args) {
    	//String s
    	//Starting point of code inspired from:
    	//https://stackoverflow.com/questions/28551228/java-converting-english-to-opish
        System.out.print("Enter a sentence (with underscores instead of spaces): ");
        String s = userinput.nextLine();
        String opp = "opp";
        String vowelthing = "";
        //Oppish translator
        for (int i = 0; i < s.length(); i++) {
            char charthing = s.charAt(i);
            if (i > 0 && s.charAt(i-1) == '_') {
                vowelthing += charthing;
            }
            else if (isVowel(charthing)) {
                vowelthing += opp + charthing;
            }
            else {
                vowelthing += charthing;
            }
        }
        //Remove opp from end of string
        //Code inspired from:
        //https://www.javatpoint.com/java-string-endswith
        if (vowelthing.endsWith("opp")) {
            vowelthing = vowelthing.substring(0, vowelthing.length() - opp.length());
        }
        vowelthing = vowelthing.replace("_" + opp, "_");
        vowelthing = vowelthing.replace(opp + "_", "_");
        vowelthing = vowelthing.replace("aopp", "a");
        vowelthing = vowelthing.replace("eopp", "e");
        vowelthing = vowelthing.replace("iopp", "i");
        vowelthing = vowelthing.replace("oopp", "o");
        vowelthing = vowelthing.replace("uopp", "u");
        vowelthing = vowelthing.replace("yopp", "y");

        
        System.out.println(vowelthing);
    }
    	//Values to skip in opp conversion
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' ||
        		c == 'u' || c == 'y'|| c == '_';
    }
}
