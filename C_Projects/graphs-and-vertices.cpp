//Date: May 14, 2024


#include <stdio.h>
#include <iostream>
#include <list>


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
	//creating a graph with 10 edges
	Graph a(10);
	a.addEdge(0, 1);
	a.addEdge(0, 2);
	a.addEdge(2, 3);
	a.addEdge(1, 2);
	a.addEdge(3, 4);
	a.addEdge(4, 5);
	a.addEdge(5, 6);
	a.addEdge(6, 7);
	a.addEdge(7, 8);
	a.addEdge(8, 9);
	a.printAdjList();
}
