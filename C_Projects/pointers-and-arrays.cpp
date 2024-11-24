//Date: April 30, 2024


#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>
#include <time.h>
#include <list>
#include <queue>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;
//function to print array
void printArray(int array[20], int length, int *point, int index) {
	cout << "The array:" << endl;
	for (int n = 0; n < length; n++) {
		cout << array[n] << " ";
	}
	cout << "\nThe pointer is currently at value " << *point << ", or index " << index;
}
//function to move pointer
int movePointer(int array[20], int *&pointer, int index) {
	//determine direction and the new value pointer needs to be pointing to
	cout << "The pointer is currently pointing at value " << *pointer << endl;
	cout << "Would you like to move the pointer left or right? ";
	string choice;
	cin >> choice;
	cout << "\nHow many times to the " << choice << " would you like to move the pointer? ";
	int timesMoved;
	cin >> timesMoved;
	if (choice == "left" || choice == "Left") {
		pointer -= timesMoved;
		index -= timesMoved;
		cout << "The pointer is now pointing to " << *pointer;
		return *pointer;
	}
	else if (choice == "right" || choice == "Right") {
        pointer += timesMoved;
        cout << "The pointer is now pointing to " << *pointer;
       	return *pointer;
	}
}
//function to change value
int changeValue (int array[20], int *pointer, int index) {
	cout << "The old value is " << *pointer << endl;
	cout << "What should the new value be? ";
	int newValue;
	cin >> newValue;
	*pointer = newValue;
	array[index] = *pointer;
	cout << "The pointer is now pointing to " << array[index];
}
//mainline
int main(){
	//fill array with random numbers
	int numArray[20];
	//starting point of code taken from https://www.w3schools.com/cpp/cpp_arrays_size.asp
	int getArrayLength = sizeof(numArray) / sizeof(int);
    for (int i = 0; i < getArrayLength; i++) {
    	//Start of code taken from https://stackoverflow.com/questions/13445688/how-to-generate-a-random-number-in-c
    	std::random_device dev;
	    std::mt19937 rng(dev());
	    std::uniform_int_distribution<std::mt19937::result_type> dist6(1,100); // distribution in range 1 - 100
	    numArray[i] = dist6(rng);
	}
	//create pointer
	int index = 5;
	int *pointer = &numArray[index];
	bool looper = true;
	while (looper) {
		cout << "\nWould you like to interact with the array? (y/n) ";
		string userAnswer;
		cin >> userAnswer;
		if (userAnswer == "y" || userAnswer == "Y") {
			cout << "Would you like to print the array, move the pointer, change the value being pointed to, or quit the program?\n(print/move/change/quit)" << endl;
			string newAnswer;
			cin >> newAnswer;
			if (newAnswer == "print" || newAnswer == "Print") {
				printArray(numArray, getArrayLength, pointer, index);
			}
			else if (newAnswer == "move" || newAnswer == "Move") {
				movePointer(&numArray[20], pointer, index);
			}
			else if (newAnswer == "change" || newAnswer == "Change") {
				changeValue(&numArray[20], pointer, index);
			}
			else if (newAnswer == "quit" || newAnswer == "Quit") {
				cout << "The final array is as follows:" << endl;
				printArray(numArray, getArrayLength, pointer, index);
			}
		}
		else {
			return 0;
		}
		
	}
	
}
