//Date: April 25, 2024


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
#include <stack>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;
//function for adding to the stack
void stackAdder(stack<int> &myStack) {
	int num;
	cout << "Please enter a number to add: ";
	cin >> num;
	myStack.push(num);
	cout << myStack.top();
}
//function for removing elements from top of stack
void stackPopper(stack<int> &myStack) {
	cout << "Removing top of stack...\n";
	myStack.pop();
}

//mainline
int main(){
	//create stack
	stack<int> newStack, duplicate;
	int topNum;
	bool k = true;
	while (k) {
		cout << "\nWould you like to change the stack? (y/n) ";
		string userAnswer;
		cin >> userAnswer;
		if (userAnswer == "y") {
			cout << "\nWould you like to add or delete a number? ";
			string newAnswer;
			cin >> newAnswer;
			if (newAnswer == "add" || newAnswer == "Add") {
				stackAdder(newStack);
			}
			else if (newAnswer == "delete" || newAnswer == "Delete") {
				stackPopper(newStack);
			}
		}
		else {
			cout << "\nThe final stack:\n";
			//start of code taken from Sample Code Stack Implementation
			duplicate = newStack;
            while (!duplicate.empty())
            {cout <<duplicate.top()<<endl;
            duplicate.pop();}
            cout <<"----------------------"<<endl;
			return 0;
		}
	}
}
