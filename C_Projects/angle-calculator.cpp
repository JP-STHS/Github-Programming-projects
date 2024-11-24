//Date: March 21, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>

using namespace std;

int main() 
{
	//Get angle measure
	float angleMeasure;
	bool checker = true;
	while (checker){
		cout << "Please enter an angle measure (between 0 - 360) ";
		cin >> angleMeasure;
		//Check if measure is in range
		if (angleMeasure > 360 or angleMeasure < 0) {	
			cout << "\nPlease enter a valid number in range! ";
			}
		else {
			//Show computations with angle measurement
			cout << "The sine of " << angleMeasure << " is " << sin(angleMeasure) << endl;
			cout << "The cosine is " << cos(angleMeasure) << endl;
			cout << "The tangent is " << tan(angleMeasure) << endl;
			float secant = 1/cos(angleMeasure);
			//Formulas taken from: https://www.cuemath.com/secant-formula/, https://www.cuemath.com/cosecant-formula/,
			//https://www.cuemath.com/cotangent-formula/
			cout << "The secant is " << secant << endl;
			float cosecant = 1/sin(angleMeasure);
			cout << "The cosecant is " << cosecant << endl;
			float cotangent = cos(angleMeasure)/sin(angleMeasure);
			cout << "The cotangent is " << cotangent << endl;
			checker = false;
		}
    }
}
