//Date: March 26, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>

using namespace std;

int main() 
{	
	//Create products
    float product1=2.98,product2=4.50,product3=9.98,product4=4.49,product5=6.87;
    int productResponse,productQuantity;
    //Ask user which product they want and how much of it.
    cout << "Which product would you like? (1-5) ";
    cin >> productResponse;
    cout << "How much of that product would you like? ";
    cin >> productQuantity;
    //Calculate and list total price
    if (productResponse==1){
    	cout << "Your total cost is " << product1*productQuantity;
	}
	else if (productResponse==2){
    	cout << "Your total cost is " << product2*productQuantity;
	}
	else if (productResponse==3){
    	cout << "Your total cost is " << product3*productQuantity;
	}
	else if (productResponse==4){
    	cout << "Your total cost is " << product4*productQuantity;
	}
	else if (productResponse==5){
    	cout << "Your total cost is " << product5*productQuantity;
	}

}
