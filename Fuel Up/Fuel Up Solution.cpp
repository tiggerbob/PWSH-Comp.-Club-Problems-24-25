// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int n, a, p;
	int total = 0, price = 1000000;
	cin >> n;

	while(n--){
		cin >> p; cin >> a; 
		if (price > p) price = p; 
		total += price * a;
	}

	cout << total;
}
