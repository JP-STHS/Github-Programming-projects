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

//Start of code taken from ChatGPT output
//Function to move the pointer based on the direction
void movePointer(int* x, int* y, string direction) {
    if (direction == "^") (*y)--;
    else if (direction == "v") (*y)++;
    else if (direction == ">") (*x)++;
    else if (direction == "<") (*x)--;
}

// Function to check if the pointer is within the boundary
bool withinBoundary(int x, int y) {
    return (x >= 0 && x < 20 && y >= 0 && y < 20);
}

//mainline
int main() {
    srand(time(0));
    string matrixArr[400];
    int index = 0;

    // Generate random arrows and store them in matrixArr
    for (int n = 0; n < 20; n++) {
        for (int i = 0; i < 20; i++) {
            int randomNum = rand() % 4 + 1;
            if (randomNum == 1) matrixArr[index] = "^";
            else if (randomNum == 2) matrixArr[index] = ">";
            else if (randomNum == 3) matrixArr[index] = "<";
            else if (randomNum == 4) matrixArr[index] = "v";
            index++;
        }
    }

    //print grid
    int totalCharacters = 400;
    int charactersPerLine = 20;
    for (int q = 0; q < totalCharacters; ++q) {
        cout << matrixArr[q] << " ";
        //make new line for each row
        if ((q + 1) % charactersPerLine == 0) {
            cout << endl;
        }
    }

    // User input for starting position
    int startX, startY;
    cout << "Enter the starting position (x y): ";
    cin >> startX >> startY;

    //create pointers
    int x = startX, y = startY;

    // Main loop to follow the arrows
    while (withinBoundary(x, y)) {
    	//mathematical function to get current position
        int currentPos = y * 20 + x;
        string direction = matrixArr[currentPos];

        //highlight current position
        matrixArr[currentPos] = "*";

        //move the pointer
        movePointer(&x, &y, direction);

        //check for conditions to end the loop
        if (x == startX && y == startY) {
            cout << "Path leads back to the starting position. Ending the program." << endl;
            break;
        } else if (!withinBoundary(x, y)) {
            cout << "Path leads outside the grid. Ending the program." << endl;
            break;
        } else if (matrixArr[y * 20 + x] == "*") {
            cout << "Path leads to the same position twice. Ending the program." << endl;
            break;
        }
    }

    //print the final grid
    for (int q = 0; q < totalCharacters; ++q) {
        cout << matrixArr[q] << " ";
        if ((q + 1) % charactersPerLine == 0) {
            cout << endl;
        }
    }

}
