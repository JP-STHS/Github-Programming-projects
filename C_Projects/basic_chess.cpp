//Date: April 11, 2024

#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <random>
#include <cstdlib>
#include <iomanip>

#include <stdbool.h>

using namespace std;


//Start of code taken from Sample Code Chess
/* This Program Will Play Chess */

/* p,k,q,n,r,b are black player */

/* P,K,Q,N,R,B are white player */

 

char board[8][8] = {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r',

        'p','p','p','p','p','p','p','p',

        '.','.','.','.','.','.','.','.',

        '.','.','.','.','.','.','.','.',

        '.','.','.','.','.','.','.','.',

        '.','.','.','.','.','.','.','.',

        'P','P','P','P','P','P','P','P',

        'R','N','B','Q','K','B','N','R'};

 

void printboard(void)

{

    int i,j;

    printf ("\n");

    for (i = 0; i <= 7; i++)

    {

        for (j = 0; j <=7; j++)

        {

            printf ("%c ",board[i][j]);

        }

        printf ("\n");

    }

}

 

int main()

{

    printboard();

    bool test;

    test = 0;

    int row1,col1,row2,col2,moves;

    while (test == 0)

    {

        printf ("\nFrom Where -->");

        scanf ("%d,%d",&row1,&col1);

        printf ("To Where -->");

        scanf ("%d,%d",&row2,&col2);
		//check if king has been captured
        test = ((board[row2][col2] == 'k') ||

               (board[row2][col2] == 'K'));
        if (test) {
        	test = 1;
		}
		board[row2][col2] = board[row1][col1];

        board[row1][col1] = '.';

        printboard();

    }

    printf ("\nThe game is over\n");

}
