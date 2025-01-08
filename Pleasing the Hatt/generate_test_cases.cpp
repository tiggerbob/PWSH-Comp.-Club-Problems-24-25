#include <bits/stdc++.h>

using namespace std;

void generate_test_case(const string &ifp, const string &ofp, int n)
{
    vector<int> markings;
    unordered_map<int, int> seen;
    int ans = 0;

    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<int> dist(1, 7777777 - 1);
    uniform_int_distribution<int> distLarge(1, 100000000);

    int ensPairs = distLarge(gen) % (n / 2 + 1);

    for (int i = 0; i < ensPairs; ++i)
    {
        int x = dist(gen);
        int y = 7777777 - x;
        markings.push_back(x);
        markings.push_back(y);
        /*
        seen[x]++;
        seen[y]++;
        */
        ans++;
    }

    int remaining = n - 2 * ensPairs;
    for (int i = 0; i < remaining; ++i)
    {
        int x = distLarge(gen);
            markings.push_back(x);
        if (seen[7777777 - x] > 0)
        {
            ans++;
            seen[7777777 - x]--;
        }
        else seen[x]++;
    }

    shuffle(markings.begin(), markings.end(), gen);

    ofstream finput(ifp);
    finput << n << "\n";
    for (int marking : markings) finput << marking << "\n";
    finput.close();

    ofstream foutput(ofp);
    foutput << ans << "\n";
    foutput.close();
}

int main()
{
    system("mkdir -p cases/input cases/output");

    vector<int> vals;
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<int> dist_small(1, 100);

    for (int i = 0; i < 17; i++) vals.push_back(dist_small(gen));
    vals.push_back(static_cast<int>(1e3));
    vals.push_back(static_cast<int>(1e4));
    vals.push_back(static_cast<int>(1e6));

    for (size_t i = 0; i < vals.size(); ++i)
    {
        string fsb = (i < 10 ? "0" : "") + to_string(i) + ".txt";
        string ifp = "cases/input/input" + fsb;
        string ofp = "cases/output/output" + fsb;
        generate_test_case(ifp, ofp, vals[i]);
    }

    return 0;
}
