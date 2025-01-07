#include <bits/stdc++.h>

using namespace std;

unordered_map<int, int> sumMap; // fast

const int kSumTarget = 7777777; // Java the Hatt's favorite number
int N, ans;

int main()
{
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        int num;
        cin >> num;
        int reqNum = kSumTarget - num;
        if (sumMap[reqNum])
        {
            sumMap[reqNum]--; // Remove this shell
            ans++;
        }
        sumMap[num]++;
    }

    cout << ans << endl;
    return 0;
}