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
//start of code inspired from https://www.youtube.com/watch?v=_IhTp8q0Mm0&list=PL43pGnjiVwgS5njI0HMGnqSH18tSSuLz_&index=11
//traverse tree in preorder fashion
void preOrder(Node* root) {
	if(root == nullptr) return;
	cout << root->data << " ";
	preOrder(root->left);
	preOrder(root->right);
}
//traverse tree in inorder fashion
void inOrder(Node* root) {
	if(root == nullptr) return;
	inOrder(root->left);
	cout << root->data << " ";
	inOrder(root->right);
}
//traverse tree in postorder fashion
void postOrder(Node* root) {
	if(root == nullptr) return;
	postOrder(root->left);
	postOrder(root->right);
	cout << root->data << " ";
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
	//print data
	cout << "The tree data in preOrder: " << endl;
	preOrder(root);
	cout << endl;
	cout << "The tree data in inOrder: " << endl;
	inOrder(root);
	cout << endl;
	cout << "The tree data in postOrder: " << endl;
	postOrder(root);
	cout << endl;
}
