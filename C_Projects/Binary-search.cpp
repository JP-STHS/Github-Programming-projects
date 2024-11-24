//Date: April 11, 2024


#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>
#include <time.h>

using namespace std;

//Start of code taken from Sample Code Binary Search
//Binary search function
int binarySearch (int arr[], int num,int count)
{
    int mid = 0, lower = 0, upper = count-1;
    for (mid = (lower+upper)/2; lower <= upper;
         mid = (lower+upper)/2){
        if (arr[mid] == num)  return mid;

        if (arr[mid]> num)  upper = mid - 1;
        else  lower = mid + 1;
    }
}
int main(){
	int num;
    int pos;
    //get size and fill array
	cout << "How many numbers would you like to place in the array? ";
	int counter;
	cin >> counter;
	int arr[counter];
	for (int i = 0; i < counter; i++) {
		cout << "Please enter a number: ";
		int inputNum;
		cin >> inputNum;
		arr[i] = inputNum;
	}
	//sort array
	//Start of code taken from Sample Code Bubble Sort
	int j;  /* j is the number of passes through the swapping process */
    int k;  /* k is the number */
    int temp;  /* temporary storage */
    for (j=0;j<counter-1;j++)
    {
        for (k=0;k<counter-1-j;k++)
        {
            if (arr[k]>arr[k+1])
            {
                temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
            }
        }
    }
    cout << "\nYour array has been sorted: ";
    for (j=0;j<counter;j++)  cout<<" "<<arr[j];   /* print the items in the list */
    printf ("\nEnter a number to search for: ");
    scanf ("%d", &num);
    pos = binarySearch(arr,num,counter);
    cout << "The Number was found in position " << pos+1;
}
