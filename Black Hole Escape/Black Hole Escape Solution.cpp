#include <bits/stdc++.h>
using namespace std;

int main() {
	
	int startFuel, startDist; cin >> startFuel >> startDist;

	bool flag = false; char member;

	for (int i = 0; i < 6; i++){
		int fuel = startFuel; int dist = startDist;
		cin >> member;
		string actions; cin >> actions;
		int j;
		for (j = 0; j < actions.length(); j++){
			if (fuel < 0 || dist < 0) {
				break;
			}
			else {
				if (actions[j] == 'r'){
					fuel += 3; dist -= 4;
				} else {
					int val = actions[j] - '0';
					fuel -= 2 * val; dist += val;
				}
			}
		}

		if (j == actions.length()){
			flag = true;
			break;
		}
	}

	if (flag == true){
		cout << member;
	} else {
		cout << "none";
	}
	
}
