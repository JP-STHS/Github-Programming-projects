//Date: April 4, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>
#include <chrono>
#include <thread>

using namespace std;

//Creating the vending machine's functions
//change function
void findChange(float &userChange) {
	float changeDue = abs(userChange);
	cout << "\nYour total change is $";
	cout << left << setfill('0') << setw(4) << changeDue;
}
//find if a user's item got stuck in the machine
void randomgraphic() {
	//start of output taken from ChatGPT
    //Seed the random number generator
    srand(time(nullptr));

    int randomNum = 1 + (rand() % 10);
    if (randomNum <= 5) {
    	return;
    }
	 else {
	 	//Allow user to get reimbursed or take immediate action
        cout << "\nIt seems your item got stuck! What would you like to do?\n1: Fill out reimbursment form\n2: Shake the machine...\nChoice: ";
        int newInput;
		cin >> newInput;
        if (newInput == 1) {
        	cout << "\nA reimbursement form has been filled.";
		}
		if (newInput == 2) {
				std::cout << R"(
 _______________________________________________
|                                         |     |
|      __           ___                   |     |
|     |  |          \  \           _____  |     |     
|     |__|          /__/          |_____| |     |     
|_________________________________________|     |   / 
|_1_|Soda____|_2_|Chips___|_3_|Chocolate__|-----|  /
|      __                                 | Ow! | / 
|     /  \          __ _          __ _    | D:< | - - - 
|     |  |         /  \\\        /  \\\   |-----| \
|     |__|         \__/ /        \__/ /   | ... |  \
|_________________________________________| ... |   \
|_4_|Water___|_5_|Caramel_|_6_|Peanut m&ms|  .  |   
|                                         |_____|     
|     __ _           __ _         __ _    |     |
|    /  \\\         /  \\\       /  \\\   |  |  |
|    \__/ /         \__/ /       \__/ /   |_____|
|_________________________________________|  _  |
|_X_|________|_X_|________|_X_|___________| |_| |
|-----------------------------------------|-----|
|                                         |     |
|                                         |     | 
|             ______________              |     | 
|            |              |             |     |
|____________|______________|_____________|_____|
|                                         |     |
		)" << '\n';
		cout << "\nThe alarm has been activated!\n";

			while (true) {
				
				std::this_thread::sleep_for(0.3s); 
				cout << " *BEEP*";
			}
		}
		else {
			cout << "\nYou decided this isn't worth your time and left.";
		}
    }
}
//Payment function
void payment(float &item) {
	//check is user wants to use cash or credit
	cout << "\nWould you like to pay with cash or credit? ";
	string moneyChoice;
	cin >> moneyChoice;
	if (moneyChoice == "Cash" || moneyChoice == "cash") {
		cout << "\nPlease enter 1, 5, or 10 dollar bills.";
		float amountDue = item;
		float cash = 0;
		while (true) {
			if (amountDue <= 0) {
				//Give user change due
				if (amountDue < 0) {
					findChange(amountDue);
				}
				randomgraphic();
				cout << "\nThank you for using the vending machine.";
				break;
			}
			else {
				cout << "\nThe amount due is $";
				cout << left << setfill('0') << setw(4) << amountDue;
				cout << "\nCash amount: ";
				//check if user is entering valid amounts of cash
				while (true) {
					cin >> cash;
					if(cash == 1.00 || cash == 5.00 || cash == 10.00){
						break;
					}
					else {
						cout << "\nPlease enter a valid cash amount (1.00, 5.00, 10.00): ";
					}
				}
			}
			amountDue -= cash;
		}
	}	
	else if (moneyChoice == "Credit" || moneyChoice == "credit") {
		cout << "\n$" << left << setfill('0') << setw(4) << item;
		cout << " has been drawn from your account. ";
		randomgraphic();
		cout<< "\nThank you for using the vending machine.";
	}
}

//Creating a vending machine
int main() {
	cout << "********** Thank you for choosing to use this vending machine! **********";
	std::cout << R"(
 _______________________________________________
|                                         |     |
|      __           ___                   |     |
|     |  |          \  \           _____  |     | 
|     |__|          /__/          |_____| |     |
|_________________________________________|     |
|_1_|Soda____|_2_|Chips___|_3_|Chocolate__|-----|
|      __                                 |  Hi |
|     /  \          __ _          __ _    |  :D |
|     |  |         /  \\\        /  \\\   |-----|
|     |__|         \__/ /        \__/ /   | ... |
|_________________________________________| ... |
|_4_|Water___|_5_|Caramel_|_6_|Peanut m&ms|  .  |
|                                         |_____|
|     __ _           __ _         __ _    |     |
|    /  \\\         /  \\\       /  \\\   |  |  |
|    \__/ /         \__/ /       \__/ /   |_____|
|_________________________________________|  _  |
|_X_|________|_X_|________|_X_|___________| |_| |
|-----------------------------------------|-----|
|                                         |     |
|                                         |     | 
|             ______________              |     | 
|            |              |             |     |
|____________|______________|_____________|_____|
|                                         |     |
		)" << '\n';
	cout << "\nPlease select an option: ";
	cout << "\n1: Soda\n2: Bag of chips\n3: Chocolate bar\n4: Water\n5: Caramel bar\n6: Peanut m&ms\nEnter choice: ";
	int userchoice=0;
	//check if user chose a valid option
	while (true) {
		cin >> userchoice;
		if (userchoice >= 1 && userchoice <= 6) {
			break;
		}
		else {
		cout << "\nPlease select a valid option (1-6). Thank you.\nReselect: ";
		}
	}
	if (userchoice == 1) {
		float soda = 1.50;
		cout << "\nYou chose the soda!";
		cout << "\nYour amount due is $";
		//Start of code taken from https://cplusplus.com/forum/beginner/57858/
		cout << left << setfill('0') << setw(4) << soda;
		payment(soda);
	}
	else if (userchoice == 2) {
		float baggedChips = 2.00;
		cout << "\nYou chose the bag of chips!";
		//output taken from ChatGPT
    	cout << "\nYour amount due is $" << fixed << setprecision(2) << baggedChips;
		payment(baggedChips);
	}
	else if (userchoice == 3) {
		float chocolateBar = 1.50;
		cout << "\nYou chose the chocolate bar!";
    	cout << "\nYour amount due is $" << fixed << setprecision(2) << chocolateBar;
		payment(chocolateBar);				
	}
	else if (userchoice == 4) {
		float bottledWater = 1.00;
		cout << "\nYou chose the water!";
		cout << "\nYour amount due is $";
    	cout << "\nYour amount due is $" << fixed << setprecision(2) << bottledWater;
		payment(bottledWater);
	}
	else if (userchoice == 5) {
		cout << "Sorry, this item is out of stock!";
	}
	else if (userchoice == 6) {
		cout << "Sorry, this item is out of stock!"	;	
	}
}
