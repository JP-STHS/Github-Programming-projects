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
	//Random number generator
	//Code borrowed from https://www.digitalocean.com/community/tutorials/random-number-generator-c-plus-plus
	int randNum = 32 + (rand() % 126); //creating the range
	cout << "Your random number is " << randNum << endl;
	cout << "The assigned ASCII character is " << char(randNum) << endl;
}
