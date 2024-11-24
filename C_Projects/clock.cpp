//Date: March 26, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <windows.h>

using namespace std;


int main() {
	//Creating a digital clock
	//Code taken from https://www.geeksforgeeks.org/digital-clock-starting-from-user-set-time-in-cpp/
	string timeOfDay;
	int hour, min, sec; 
    cout << "*Enter Current time*\n"; 
  
    //Get user input
    cout << "HH- "; 
    cin >> hour; 
    cout << "MM- "; 
    cin >> min; 
    cout << "SS- "; 
    cin >> sec; 
  
  	//Error handling
    if (hour > 23) { 
        cout << "Wrong Time input"; 
    } 
    else if (min > 60) { 
        cout << "Wrong Time Input"; 
    } 
    else if (sec > 60) { 
        cout << "Wrong Time Input"; 
    } 
  	//Display clock
    else { 
        while (1) 
  
        { 
            system("cls"); 
   
            for (hour; hour < 24; hour++) { 
  
                for (min; min < 60; min++) { 
  
                    for (sec; sec < 60; sec++) { 
                        system("cls"); 
                        //determine if it is AM or PM
                        int currenthr = hour;
  						switch(currenthr) {
  							case 13: currenthr = 1; break;
  							case 14: currenthr = 2; break;
  							case 15: currenthr = 3; break;
  							case 16: currenthr = 4; break;
  							case 17: currenthr = 5; break;
  							case 18: currenthr = 6; break;
  							case 19: currenthr = 7; break;
  							case 20: currenthr = 8; break;
  							case 21: currenthr = 9; break;
  							case 22: currenthr = 10; break;
  							case 23: currenthr = 11; break;
  							case 24: currenthr = 12; break;
						  }
						if (hour < 12 || hour == 24) {
							timeOfDay = "AM";
						}
						else{
							timeOfDay = "PM";
						}
                        cout << "\n\n\n\n~~~~~~~~~"
                                "~~~~~~~~~~~~~~~~~~~~~"
                                "~~~~~~~~~~~~~~~~~~"
                                "Current Time = "
                             << currenthr << ":" << min << ":"
                             << sec 
                             << " " << timeOfDay << "~~~~~~~~~~~~~~~~~~"
                                "~~~~~~~~~~~~~~~~~~~~~"
                                "~~~~~~~~~"; 
    
                        Sleep(1000); 
                    } 
                    sec = 0; 
                } 
                min = 0; 
            } 
        } 
    } 
}
