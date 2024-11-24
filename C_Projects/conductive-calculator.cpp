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
	//define the voltage, resistance, seconds, and inductance
	float voltage=0, resistance=0, inductance=0, seconds=0;
	cout << "Please enter the voltage, resistance, inductance, and seconds. \n";
	cin >> voltage >> resistance >> inductance >> seconds;
	float powField2 = -(resistance/inductance)*seconds;
	float eValue = pow(2.71828183,powField2);
	//Find the current
	float currentI = (voltage/resistance)*(1- eValue);
	cout << "\nThe current for a voltage of " << voltage << ", resistance of " << resistance
	<< ", inductance of " << inductance << ", and " << seconds << " amount of seconds is " << currentI;
}
