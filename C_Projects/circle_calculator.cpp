//Date: April 11, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>

using namespace std;


int main() {
	float sphereList[50][3];
	//Start of code taken from ChatGPT output
    // Calculate and store radii, volume, and surface area
    for (int r = 0; r < 50; r++) {
    	float volume = (4/3)*3.14*pow(r,3);
		float surfaceArea = 4*3.14*pow(r,2);
        sphereList[r][0] = r + 1;
        sphereList[r][1] = volume;
        sphereList[r][2] = surfaceArea;
    }
    // Print in tabular form
    cout << setw(10) << "Radius" << setw(15) << "Volume" << setw(20) << "Surface Area" << endl;
    cout << setfill('-') << setw(45) << "-" << endl;
    cout << setfill(' ');
    for (int i = 0; i < 50; i++) {
        cout << fixed << setw(10) << setprecision(4) << sphereList[i][0]
		<< setw(15) << setprecision(4) << sphereList[i][1] << setw(20)
		<< setprecision(4) << sphereList[i][2] << endl;
    }
}
