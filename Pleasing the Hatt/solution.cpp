#include <bits/stdc++.h>

using namespace std;

unordered_map<int, int> sumMap; // fast

const int kSumTarget = 7777777; // Java the Hatt's favorite number
int N, ans;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        int num;
        cin >> num;
        int reqNum = kSumTarget - num;
        if (sumMap[reqNum] > 0)
        {
            sumMap[reqNum]--; // Remove this shell
            ans++;
        }
        else sumMap[num]++;
    }

    cout << ans << endl;
    return 0;
}