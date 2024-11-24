import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;

public class JavaSoundsLikeCoffee {
	static Scanner userinput = new Scanner(System.in);
	
    public static void main(String[] args) {
    	//Starting point of code borrowed from:
    	//https://gist.github.com/letrongtanbs/d29354da30f12784bc8453af4e4fb6ff
    	double monthlyPayment, loanAmount, monthlyRate, numberOfYears, totalPayment, rate =0;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the loan amount ($)\n(Eg: 1000): ");
        loanAmount = input.nextDouble();
        while (loanAmount < 100 || loanAmount > 10000000) {
            System.out.println("The loan entered is too large or too small. Please enter a loan between"
            		+ " $100 and $10,000,000: ");
            loanAmount = input.nextDouble();
        }
        System.out.print("Enter the length of the loan in years\n(Eg: 4): ");
        numberOfYears = input.nextDouble();
        while (numberOfYears < 3 || numberOfYears > 99) {
        	System.out.print("The number of years entered is either too much or too little! "
        			+ "Please enter a valid number between 3 and 99: ");
            numberOfYears = input.nextDouble();
        }
        
        System.out.print("Enter the annual interest rate \n(Eg: 4.9% =0.049) : ");
        rate = input.nextDouble();
        while (rate < 0.0 || rate > 0.20) {
        	System.out.print("The annual interest rate is too low or too high!"
        			+ " Please enter a value between 0% and 20% (0.0 and 0.20): ");
            rate = input.nextDouble();
        }
        
        monthlyRate = rate/12;
        // Monthly interest rate 
        // is the yearly rate divided by 12
          
        monthlyPayment = loanAmount * monthlyRate /(1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));
        totalPayment = monthlyPayment * numberOfYears * 12;
        double InterestStatistic = (rate*totalPayment)/100*100;
        
        // NumberFormat is useful for formatting numbers
        // In our case we'll use it for 
        // formatting currency and percentage values
       
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat = NumberFormat.getPercentInstance();
 
        // Display details of the loan
 
        System.out.println("Loan Amount: "+ currencyFormat.format(loanAmount));
        System.out.println("The annual interest rate : "+ interestFormat.format(rate));
        System.out.println("Monthly Payment: "+ currencyFormat.format(monthlyPayment));
        System.out.println("Total Payment: "+ currencyFormat.format(totalPayment));
        System.out.println("Interest: " + currencyFormat.format(InterestStatistic) );
 

    }
}  

