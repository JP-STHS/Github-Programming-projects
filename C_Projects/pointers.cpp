//Date: April 30, 2024


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


//mainline
int main(){
	double x; 	//create variable x
	double* p; 	//create variable p
	double** q; //create variable q
	x = 2.6; 	//the x value
	p = &x; 	//pointer p pointing to the location of x in memory
	q = &p;		//pointer q pointing to pointer p
	cout << x << " is the x value, p-->" << p << " and q -->" << q << endl;
	x ++;		//(1) incrementing the x value by one, location in memory has not changed
	cout << &x << " <-- The location of x has not changed" << endl;
	*p ++;		//(2) incrementing the p pointer by one, it points to the next spot in memory
	**q ++;		//(3) incrementing the q pointer by one, it now points to the location of x
	cout << "The location of x is " << &x << ", the location of p is " << &p << ", and the location of q is " << &q << "." << endl;
	cout << x << " is the x value, p-->" << p << " and q -->" << q << endl;
	p++;		//(4) the location of p remains the same, but p now points to the next spot in memory
	q++;		//(5) the location of q remains the same, but q now points to the next spot in memory 
	cout << "The location of p is " << &p << " and pointer q is now in location " << &q << endl;
	cout << x << " is the x value, p-->" << p << " and q -->" << q << endl;
}         
