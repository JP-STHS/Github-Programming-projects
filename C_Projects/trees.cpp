//Date: May 9, 2024


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

//start of code taken from Sample Code Expression Trees Implementation
//creating the tree data structure
struct Node {
	int data;
	Node* left;
	Node* right;
	
};
//creating nodes
Node* createNode (int data) {
	Node* newNode = new Node();
	newNode->data = data;
	newNode->left=newNode->right=nullptr;
	return newNode;
}
//start of code taken from chatGPT output
//function to print nodes
// Function to display left and right nodes in no particular order
void displayNodes(Node* root) {
 	if (root == nullptr)
        return;
    
    displayNodes(root->left);
    cout << root->data << " ";
    displayNodes(root->right);
}

//mainline
int main() {
	//layer 1
	Node* root = createNode(1);
	root->left = createNode(2);
	root->right = createNode(300);
	//Layer 2
	root->left->left = createNode(4);
	root->left->right = createNode(500);
	root->right->right = createNode(6);
	root->right->left = createNode(700);
	//layer 3
	root->left->left->left = createNode(8);
	root->left->left->right = createNode (900);
	root->left->right->left = createNode (10);
	root->left->right->right = createNode(1100);
	
	//display nodes
    cout << "Nodes: ";
    displayNodes(root);
    cout << endl;

}
