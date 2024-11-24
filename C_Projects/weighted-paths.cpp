//Date: May 14, 2024


#include<iostream>
#include<unordered_map>
#include<map>
#include<list>
#include<cstring>
#include <queue>
#include <vector>
#include <climits>

using namespace std;

template<typename T>
class Graph{
    map<T,list<pair<T, int>>> l;
public:
	//Start of code taken from ChatGPT output
	//Start of code taken from https://www.youtube.com/watch?v=uQtX6dfbk0M
	//Start of code taken from Sample Code Weighted Graph Implementation
    void addEdge(T x, T y, bool bidir, int wt) {
        l[x].push_back(make_pair(y, wt));
        if (bidir) {
            l[y].push_back(make_pair(x, wt));
        }
    }

    void bfs(T src) {
        map<T, bool> visited;
        queue<T> q;
        q.push(src);
        visited[src] = true;

        while(!q.empty()) {
            T node = q.front();
            q.pop();

            for(auto nbr : l[node]) {
                if(!visited[nbr.first]) {
                    q.push(nbr.first);
                    visited[nbr.first] = true;
                }
            }
        }
    }

    void printAdjList() {
        for (auto p : l) {
            T tail = p.first;
            list<pair<T, int>> nbrs = p.second;
            cout << tail << ": ";
            for (auto nbr : nbrs) {
                T head = nbr.first;
                int weight = nbr.second;
                cout << "(" << head << " " << weight << ") ";
            }
            cout << endl;
        }
    }

    // Modified DFS to find a path between src and dest
    bool DFS(T src, T dest, map<T, bool>& visited, vector<T>& path, int& totalWeight) {
        visited[src] = true;
        path.push_back(src);

        if (src == dest)
            return true;

        for (auto nbr : l[src]) {
            if (!visited[nbr.first]) {
                totalWeight += nbr.second;
                bool found = DFS(nbr.first, dest, visited, path, totalWeight);
                if (found)
                    return true;
                totalWeight -= nbr.second;
            }
        }

        // If no path found, backtrack
        path.pop_back();
        visited[src] = false;
        return false;
    }

    // Function to find and print path between src and dest
    void findPath(T src, T dest) {
        map<T, bool> visited;
        vector<T> path;
        int totalWeight = 0;

        bool found = DFS(src, dest, visited, path, totalWeight);
        if (found) {
            cout << "Path: ";
            for (auto node : path)
                cout << node << " -> ";
            cout << endl;
            cout << "Total weight: " << totalWeight << endl;
        } else {
            cout << "Path not found between " << src << " and " << dest << endl;
        }
    }
};

// Mainline
int main() {
    Graph<string> g;
    g.addEdge("A", "B", false, 20);
    g.addEdge("B", "D", false, 40);
    g.addEdge("A", "C", false, 10);
    g.addEdge("C", "D", false, 30);
    g.addEdge("A", "D", true, 50);

    g.printAdjList();

    string start, end;
    cout << "Enter starting node: ";
    cin >> start;
    cout << "Enter ending node: ";
    cin >> end;

    g.findPath(start, end);

    return 0;
}
