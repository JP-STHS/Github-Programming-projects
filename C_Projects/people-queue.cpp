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
#include <queue>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;
//function for printing the queue
//starting point of code taken from CodeBeauty video at 7:53: https://youtu.be/jaK4pn1jXTo?list=PL43pGnjiVwgS5njI0HMGnqSH18tSSuLz_
void printQueue(queue<string> myQueue) {
	while (!myQueue.empty()) {
		cout << myQueue.front() << " ";
		myQueue.pop();
		cout << endl;
	}
}
//mainline
int main(){
	queue<string> shopQueue;
	//Start of code taken from Random Number Generator program https://stackoverflow.com/questions/7560114/random-number-c-in-some-range
	//determining amount of time to check out
	random_device rd; // obtain a random number from hardware
    mt19937 gen(rd()); // seed the generator
    uniform_int_distribution<> distr(1, 3); // define the range
    uniform_int_distribution<> distr2(1, 5); // define the range
    //add people to queue
    cout << "How many people are in the queue? ";
    int numPeople;
    cin >> numPeople;
    for (int n = 0; n < numPeople; n++){
    	cout << "Please add a person: ";
    	string newPerson;
    	cin >> newPerson;
    	shopQueue.push(newPerson);
	}
	//allow people to leave and join queue
	int i;
	for (int x = 0; x<60;) {
		int randomCheckOut = distr(gen);
		int randomCheckIn = distr2(gen);
		i+=randomCheckOut;
		x += randomCheckIn;
		if (!shopQueue.empty()) {
			cout << "Customer " << shopQueue.front() <<" is leaving the queue after " << randomCheckOut << " minutes." << endl;
			shopQueue.pop();
			if (i > x){
				cout << "A new customer has joined after "<< randomCheckIn <<" minutes!" << endl;
				cout << "Please enter the customer's name: ";
				string custName;
				
				cin >> custName;
				shopQueue.push(custName);
			}
			else {
				x -= randomCheckIn;
			}
		}
		else {
			cout << "The queue is empty!" << endl;
			cout << "Please enter a customer's name: ";
			string custName;
			cin >> custName;
			shopQueue.push(custName);
		}
	}
	cout << "One hour has passed..." << endl;
	cout << "The final queue: " << endl;
	printQueue(shopQueue);

    	
}         
