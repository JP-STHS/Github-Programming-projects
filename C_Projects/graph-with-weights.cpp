//Date: May 14, 2024


#include <stdio.h>
#include <iostream>
#include <list>
#include<unordered_map>


using namespace std;
//start of code taken from https://www.youtube.com/watch?v=drpdVQq5-mk
//start of code taken from Sample Code Weighted Graph Implementation
class Graph{
    unordered_map<string,list<pair<string,int> > > l;
public:

    void addEdge(string x, string y, bool bidir, int wt) {
        l[x].push_back(make_pair(y,wt));
        if (bidir) {
            l[y].push_back(make_pair(x,wt));
        }

    };
    void printAdjList(){
        for (auto p :l){
            string tail = p.first;
            list<pair<string,int> > nbrs = p.second;
            cout <<tail<<": ";
            for (auto nbr:nbrs){
                string head = nbr.first;
                int weight = nbr.second;
                cout <<"("<<head<<" "<<weight<<") ";
            }
            cout <<endl;
        }
    };
};

//mainline
int main() {
	//creating a graph with 10 nodes and 10 edges
	Graph g;
    g.addEdge("A","B", false, 20);
    g.addEdge("B","C", false, 40);
    g.addEdge("C","D", false, 10);
    g.addEdge("D","E", false, 30);
    g.addEdge("A","D", true, 60);
    g.addEdge("D","G", false, 30);
    g.addEdge("F","H", false, 900);
    g.addEdge("I","J", false, 10);
    g.addEdge("H","I", true, 98);
    g.addEdge("J","K", false, 73);
    g.addEdge("I","K", true, 50);

    g.printAdjList();
    return 0;
}
