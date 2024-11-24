//Date: April 16, 2024


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

using namespace std;

//Start of code taken from Sample Code List Implementation
//function to add list values
void addElement (list<int> &myList) {
	int inserted;
	cout << "\nPlease enter a value to insert: ";
	cin >> inserted;
	myList.push_front(inserted);
}
//function to remove list values
void removeElement (list<int> &myList) {
	int removed;
	cout << "\nThe current list: \n";
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
	list<int> numList;
	//creating a list of integers
	for (int n=0; n < 5; n++){
		numList.push_back(n);
	}
	bool check = true;
	while (check) {
		string answer;
		cout << "\nDo you want to make adjustments to the list? (y/n) ";
		cin >> answer;
		if (answer == "n") {
			break;
		}
		else {
			cout << "\nWould you like to insert, delete, print, or sort elements of the list? ";
			cin >> answer;
			if (answer == "insert" || answer == "Insert"){
				addElement(numList);
			}
			else if (answer == "delete" || answer == "Delete"){
				removeElement(numList);
			}
			else if (answer == "sort"|| answer == "Sort"){
				numList.sort();
			}
			else if (answer == "print" || answer == "Print"){
				cout << "\nThe list so far: \n";
				for (const auto& num : numList) {
					cout << num << " ";
				}
			}
		}
	}
	
	//print the final list
	cout << "\nFinal results: ";
	for (const auto& num : numList) {
        cout << num << " ";
    }
}
