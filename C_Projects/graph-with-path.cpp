//Date: May 14, 2024


#include <stdio.h>
#include <iostream>
#include <list>
#include <time.h>
#include <cstdlib>

using namespace std;
//start of code taken from https://youtu.be/dhgKr8942rs
//creating the graph structure
class Graph{
	//V indicates a vertice
	int V;
	list<int> *l;
public:
	Graph(int V) {
		this->V = V;
		l = new list<int>[V];
	}
	
	void addEdge(int x, int y) {
		l[x].push_back(y);
		l[y].push_back(x);
	}
	void printAdjList(){
		//printing the vertices
		for(int i=0;i<V;i++) {
			cout << "Vertex " << i << "->";
			for(int nbr:l[i]) {
				cout<<nbr<<",";
			}
			cout << endl;
		}		
	}
};

//mainline
int main() {
	//get path length
	int path;
	cout << "How long should the path be? (1-10) " << endl;
	cin >> path;
	while (path < 0 || path > 10) {
		cout << "Please enter a valid path:";
		cin >> path;
	}
	
	Graph a(path);
	//creating a graph with 10 edges
	//start of code taken from chatgpt output
	for (int i = 0; i < path; i++) {
    // Generate a random number within the range [0, path)
    int randomNum = rand() % path;
    // Ensure that the random number is different from i
    while (randomNum == i) {
        randomNum = rand() % path;
    	}
    a.addEdge(i, randomNum);
	}
	a.printAdjList();
}
