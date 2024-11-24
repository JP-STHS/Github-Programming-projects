//Date: April 18, 2024


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
#include <bits/stdc++.h>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;

//start of code taken from Sample Code Unordered Set Implementation
//function for performing set union
unordered_set<string> setUnion (unordered_set<string> a, unordered_set<string> b)
{
  unordered_set<string> c;
  c = a;
 for (auto item : b) c.insert(item);
 return c;
}
//function for perfornming set intersection
unordered_set<string> setIntersection (unordered_set<string> a, unordered_set<string> b)
{
  unordered_set<string> c;
  for (auto item : b)
  { 
    if (a.find(item) != a.end())  {c.insert(item);}
  }
 return c;
}
//function to print the set
void printSet (unordered_set<string> a)
{
   for (auto item : a) {
      cout <<item<<endl;
   }
}
//start of code edited from ChatGPT output
//function to subtract set B from set A
unordered_set<string> setDeleteBfromA(unordered_set<string> a, const unordered_set<string>& b) {
    unordered_set<string> c;
    for (const auto& elem : a) {
        if (b.find(elem) == b.end()) {
            c.insert(elem);
        }
    }
    return c;
}
//function to subtract set A from set B
unordered_set<string> setDeleteAfromB(unordered_set<string> a, const unordered_set<string>& b) {
    unordered_set<string> c;
    for (const auto& elem : a) {
        if (b.find(elem) == b.end()) {
            c.insert(elem);
        }
    }
    return c;
}
//mainline
int main(){
	//fill the set
   unordered_set<string> items1, items2, c, d, e, f;
   items1.insert ("Hello World");
   items1.insert ("316");
   items1.insert ("Orange");
   items1.insert ("blue");
   items2.insert ("z");
   items2.insert ("3.14");
   items2.insert ("(.-_.^)");
   items2.insert ("316");
   items2.insert ("blue");
   
   //Print the elements of each set for each function
   cout <<"The Elements of Set 1 are:\n";
   printSet (items1);
   cout <<"The Elements of Set 2 are:\n";
   printSet (items2);
   c = setUnion(items1, items2);
   cout <<"The Elements of the Union are:\n";
   printSet (c);
   d = setIntersection(items1, items2); 
   cout <<"The Elements of the Intersection are:\n";
   printSet (d);
   cout <<"The Elements of Set 2 subtracted by Set 1 are:\n";
   e = setDeleteBfromA(items1, items2);
   printSet (e);
   cout <<"The Elements of Set 1 subtracted by Set 2 are:\n";
   f = setDeleteAfromB(items2, items1);
   printSet (f);
}
