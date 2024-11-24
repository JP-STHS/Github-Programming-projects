//Date: May 2, 2024


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

//Function to display mean and standard deviation of array
int mathFunctions(int array[],int amount, int &counter, list<int> numList) {
	if (counter == 1) {
		//find average of array
		cout << "The average of your array is ";
		int summer = 0;
		for (int i = 0; i < amount; i++) {
			summer += array[i];
		}
		//start of code taken from https://www.geeksforgeeks.org/static_cast-in-cpp/
		//convert integers to floats for finding accurate average
		float avg = static_cast<float>(summer) /  amount;
		cout<< fixed << setprecision(2) << avg;
		//find standard deviation of array
		//start of code taken from https://www.programiz.com/cpp-programming/examples/standard-deviation
		float standardDeviation;
		for(int i = 0; i < amount; i++) {
			standardDeviation += pow(array[i] - avg, 2);
		}
		cout << "\nThe standard deviation is "<< sqrt(standardDeviation / amount);
		counter++;
		return counter;
	}
	else if (counter != 1) {
		//find average of list
		cout << "The average of your list is ";
		int sum;
		//start of code taken from https://stackoverflow.com/questions/19684652/adding-up-values-in-a-list
		sum = accumulate(begin(numList), end(numList), 0.0);
		
		//convert integers to floats for finding accurate average
		float avg = static_cast<float>(sum) / amount;
		cout<< fixed << setprecision(2) << avg;
		//find standard deviation
		//start of code taken from chatGPT output
		float standardDeviation;
		for (auto data : numList) {
			standardDeviation += pow(data - avg, 2);
	    }
		cout << "\nThe standard deviation is "<< sqrt(standardDeviation / amount);
		counter++;
		return counter;
	}
}
//mainline
int main() {
	int counter = 1;
	list<int> numList;
	//define size of array
    cout << "How many elements in the array?" << endl;
    int userAnswer;
    cin >> userAnswer;
    int numArray[userAnswer];
    //request user to enter each value
    int newAnswer;
    for (int n = 0; n < userAnswer;n++) {
    	cout << "Please enter a value to insert into the array\n";
    	cin >> newAnswer;
		numArray[n] = newAnswer;
	}
	//find average and standard deviation
	mathFunctions(numArray, userAnswer, counter, numList);
	//creating a number list
	for (int j = 0; j < userAnswer; j++) {
		cout << endl << "Please enter a number to insert into the list: ";
		int listInput;
		cin >> listInput;
		numList.push_back(listInput);
	}
	numList.push_back(1);
	mathFunctions(numArray, userAnswer, counter, numList);
}
