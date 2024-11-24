//Date: April 18, 2024


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
#include <vector>

using namespace std;

//funtion to add value
void addNum (vector<double> &myList) {
	cout << "Please enter a double to insert: ";
	double doubleValue;
	cin >> doubleValue;
	myList.push_back(doubleValue);
	}
//function to remove value
void removeNum (vector<double> &myList) {
	int removed;
	cout << "\nThe current vector list: \n";
	for (const auto& num : myList) {
        cout << num << " ";
    }	
	cout << "\nPlease enter the position of the number you would like removed: ";
	cin >> removed;
	removed -= 1;
	//start of code taken from chatGPT output
	auto it = next(myList.begin(), removed); // Iterator pointing to the third element
    myList.erase(it);
}

//mainline
int main(){
	vector<double> numVector;
	for (double u = 0.35; u < 5; u++) {
		numVector.push_back(u);
	}
	//ask user which operation should be performed
	bool checker = true;
	while (checker) {
		cout << "Would you like to edit the list? (y/n) ";
		string answer;
		cin >> answer;
		if (answer == "y") {
			cout << "Would you like to add, delete, or print elements of the list? ";
			string newAnswer;
			cin >> newAnswer;
			if (newAnswer == "add" || newAnswer == "Add") {
				addNum(numVector);
			}
			else if (newAnswer == "delete" || newAnswer == "Delete") {
				removeNum(numVector);
			}
			else if (newAnswer == "print" || newAnswer == "Print") {
				for (const auto& num : numVector) {
        			cout << setprecision(2) << num << " ";
				}
			}
		}
		else {
			break;
		}
		
	}
	cout << "Your final vector list:\n";
	for (const auto& num : numVector) {
        cout << setprecision(2) << num << " ";
    }
}
