//Date: March 19, 2024


#include <stdio.h>
#include <iostream>
#include <string>
//Start of code borrowed from Sample Code "Computations"
#include <math.h>
#include <stdlib.h>

using namespace std;

int main() 
{
	//Prompt user to enter two decimal numbers
	float dec1,dec2;
	printf("Please enter two decimal numbers:\n");
	//Start of code inspired from https://www.programiz.com/cpp-programming/operators#arithmetic
	cin >> dec1 >> dec2;
	//Do computations and print results
	printf ("\nThe sum is %.4lf\n", dec1 + dec2);
	printf ("\nThe average is %.4lf\n", (dec1 + dec2)/2.0);
	printf ("\nThe difference is %.4lf\n", dec1 - dec2);
	printf ("\nThe product is %.4lf\n", dec1*dec2);
	printf ("\nThe quotient is %d\n", dec1/dec2);
	printf ("\nThe exponentiation is %.4lf\n", pow(dec1,dec2));
	
	return 0;
