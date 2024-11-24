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
#include <stdbool.h>
#include <stddef.h>
#include <string.h>
#include <time.h>

using namespace std;

//Start of code taken from ChatGPT output and Sample Code Bubble Sort
#define SIZE 20

// Generic bubble sort function
void bubbleSort(void *array, size_t size, size_t elem_size, int (*cmp)(const void *, const void *)) {
    char *arr = (char *)array;
    size_t i, j;
    for (i = 0; i < size - 1; i++) {
        for (j = 0; j < size - 1 - i; j++) {
            char *current = arr + j * elem_size;
            char *next = arr + (j + 1) * elem_size;
            if (cmp(current, next) > 0) {
                char temp[elem_size];
                memcpy(temp, current, elem_size);
                memcpy(current, next, elem_size);
                memcpy(next, temp, elem_size);
            }
        }
    }
}

// Integer comparison function
int int_cmp(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

// Double comparison function
int double_cmp(const void *a, const void *b) {
    if (*(double *)a < *(double *)b) return -1;
    if (*(double *)a > *(double *)b) return 1;
    return 0;
}

// Character comparison function
int char_cmp(const void *a, const void *b) {
    return (*(char *)a - *(char *)b);
}

// Function to print the array
void printArray(void *array, size_t size, size_t elem_size, void (*print)(const void *)) {
    char *arr = (char *)array;
    size_t i;
    for (i = 0; i < size; i++) {
        print(arr + i * elem_size);
        printf(" ");
    }
    printf("\n");
}

// Function to print an integer
void printInt(const void *a) {
    printf("%d", *(int *)a);
}

// Function to print a double
void printDouble(const void *a) {
    printf("%.2f", *(double *)a);
}

// Function to print a character
void printChar(const void *a) {
    printf("%c", *(char *)a);
}

int main() {
    srand(time(NULL));
    int choice;
    //ask user for the data type
    printf("Please enter the number that represents which type of data you would like to sort.\n");
    printf("     1. Integers          2. Doubles          3. Characters\nChoice: ");
    scanf("%d", &choice);

    void *array;
    size_t elem_size;
    int (*cmp)(const void *, const void *);
    void (*print)(const void *);
	//respond to user's choice accordingly and check if user choice is valid
    switch (choice) {
        case 1:
            array = malloc(SIZE * sizeof(int));
            elem_size = sizeof(int);
            cmp = int_cmp;
            print = printInt;
            break;
        case 2:
            array = malloc(SIZE * sizeof(double));
            elem_size = sizeof(double);
            cmp = double_cmp;
            print = printDouble;
            break;
        case 3:
            array = malloc(SIZE * sizeof(char));
            elem_size = sizeof(char);
            cmp = char_cmp;
            print = printChar;
            break;
        default:
            printf("Invalid choice.\n");
            return 1;
    }
	//random data to fill array
    size_t i;
    for (i = 0; i < SIZE; i++) {
        if (choice == 1) {
            *((int *)array + i) = rand() % 100;
        } else if (choice == 2) {
            *((double *)array + i) = (double)(rand() % 10000) / 100;
        } else {
            *((char *)array + i) = 'a' + rand() % 26;
        }
    }

    cout << "Unsorted array:\n";
    printArray(array, SIZE, elem_size, print);

    bubbleSort(array, SIZE, elem_size, cmp);

 	cout << "Sorted array:\n";
    printArray(array, SIZE, elem_size, print);
}
