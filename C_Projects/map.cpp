//Date: April 25, 2024


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
#include <map>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;


//mainline
int main(){
	//create map
	map<string, string> myD;
	myD.insert(pair<string, string>("il1k3c@rs1212", "Hello John, welcome back."));
	myD.insert(pair<string, string>("wasdijklqp1290", "Hola Dan, Bienvenida!"));
	myD.insert(pair<string, string>("amogus", "Wecome back Bobby.\nYour account is at risk, please change your password."));
	//ask user for password
	cout << "Please enter your password: ";
	string password;
	cin >> password;
	//if password is correct, show user password
	for (auto pair : myD) {
		if (password == pair.first) {
			cout << pair.second;}
	}
}
