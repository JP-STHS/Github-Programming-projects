//Date: April 11, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>

#include <stdbool.h>

using namespace std;


//Start of code taken from Sample Code Sum Sequence
bool contains(int numbers[], int testnum, int size)
{
    int index;  //index number for sequence
    for (index = 0; index <= size; index++) {
        if (numbers[index] == testnum) {
            return true;
        }
    }
    return false;
}
int main() {
	// check if user is entering a number in range
	cout << "Please enter a number between 10 and 300: ";
    int length;         // the length of the sequence
    bool checker = true;
    while (checker) {
    	cin >> length;
    	if (length < 10 || length > 300) {
    		cout << "Please enter a valid number: ";
    		checker = true;
		}
		else {
			checker = false;
		}
	}
	    
    int testMax = length * 10;   // the maximum number to test for the sequence
    int sequence[length];     // the sequence itself
    int index;                // index value of the sequence
    int curnum;               // current number to test for the sequence
    int testsum;              // the sum of consecutive terms to test
    int sqrtsum;              // sqrt of consecutive terms to test
    bool used;                // was the number tested already in the sequence?
    bool testsquare;          // is the number tested a square
    sequence[0] = 1;
    printf ("This will create a sequence where consecutive numbers sum to a square!\n");
    for (index = 1; index < length; index++) {
        for (curnum = 1; curnum < testMax; curnum++) {
            used = contains(sequence,curnum,index);
            testsum = curnum + sequence[index-1];
            sqrtsum = sqrt(testsum);
            testsquare = (sqrtsum*sqrtsum == testsum);
            if (testsquare && (!used)) {
                sequence[index] = curnum;
                printf ("%d,", sequence[index]);
                break;
            }
        }
    }
}
