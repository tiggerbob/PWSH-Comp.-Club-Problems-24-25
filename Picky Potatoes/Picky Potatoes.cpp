// prefix & suffix sums (kadane's algorithm)

#include <bits/stdc++.h>
#define ll long long
using namespace std;

bool solve() {
    int N; cin >> N;
    vector <long long> s; s.resize(N);

    for (auto &i : s) cin >> i;

    ll sum = 0;
    for (int i = 0; i < N; i++){
        sum += s[i];
        if (sum <= 0) return false;
    }

    sum = 0;
    for (int i = N - 1; i >= 0; i--){
        sum += s[i];
        if (sum <= 0) return false;
    }

    return true;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(nullptr);
    
    int t; cin >> t;
    while (t--){
        if (solve()) cout << ":)\n";
        else cout << ":(\n";
    }
}
