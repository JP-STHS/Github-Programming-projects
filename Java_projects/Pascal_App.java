import java.util.Arrays;

public class JavaSoundsLikeCoffee {
    public static void main(String[] args) {
        // Starting point of code borrowed from Sample Code Logarithm Table
        int[][] sheet = new int[11][11];
        int size = sheet.length;
        
        // Starting point of code inspired from 
        //https://www.java67.com/2016/06/how-to-print-pascal-triangle-in-java.html
        //https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/
        // Computing Pascal's triangle with for loops
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    sheet[i][j] = 1;
                } else {
                    sheet[i][j] = sheet[i-1][j-1] + sheet[i-1][j];
                }
            }
        }
        
        // Printing Pascals's triangle
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sheet[i][j] + " ");
            }
            System.out.println();
        }
    }
}


