#include <bits/stdc++.h>
using namespace std;

int main() {

	// fast input/output
	ios_base::sync_with_stdio(false);
	cin.tie(nullptr);

	// loop and flush buffer
	int n; cin >> n; 
	cin.clear(); cin.ignore(INT_MAX, '\n');

	for (int i = 0; i < n; i++){
		string str; getline(cin, str);
		int len = str.length();
		int startPos;
		vector<char> decoded;

		if (len%2 == 0) startPos = len/2;
		else startPos = (int) ceil(len/2);

		for (int j = 0; j < len; j++){
			int m = (int) pow(-1, j);
			startPos += m*j;
			decoded.push_back(str[startPos]);
		}

		for (const char &character : decoded){
			cout << character;
		}
		cout << endl;
	}
	

}
