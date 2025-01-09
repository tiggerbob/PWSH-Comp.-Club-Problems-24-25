#include <bits/stdc++.h>

using namespace std;

const int nCases = 20;

int main()
{
    system("mkdir -p cases/input cases/output");
    srand(time(0));

    pair<int, int> sizes[nCases];

    for (int i = 0; i < nCases - 3; i++) sizes[i] = { rand() % 100 + 1, rand() % 100 + 1 };
    // Difficulty scaling
    sizes[nCases - 3] = { 300, 300 };
    sizes[nCases - 2] = { 500, 500};
    sizes[nCases - 1] = { 1000, 900 };

    for (int t = 0; t < nCases; t++)
    {
        int N = sizes[t].first;
        int M = sizes[t].second;

        char rooms[N][M] = {};
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                int c = rand() % 4;
                switch (c)
                {
                case 0:
                    rooms[i][j] = '*';
                    break;
                case 1:
                    rooms[i][j] = '.';
                    break;
                case 2:
                    rooms[i][j] = '#';
                    break;
                default:
                    rooms[i][j] = '.';
                    break;
                }
            }
        }
        pair<int, int> start = {rand() % N, rand() % M};
        rooms[start.first][start.second] = '@';

        int ans = 0;
        bool visited[N][M] = {};
        queue<pair<int, int>> q;
        q.push(start);
        int x, y;
        while (!q.empty())
        {
            x = q.front().first;
            y = q.front().second;
            q.pop();

            if (x < 0 || x >= N || y < 0 || y >= M || (rooms[x][y] != '.' && rooms[x][y] != '@') || visited[x][y])
                continue;

            visited[x][y] = true;
            ans++;

            q.push({x - 1, y});
            q.push({x + 1, y});
            q.push({x, y - 1});
            q.push({x, y + 1});
        }

        const string fsb = (t < 10 ? "0" : "") + to_string(t) + ".txt";
        const string ifp = "cases/input/input" + fsb;
        const string ofp = "cases/output/output" + fsb;

        ofstream finput(ifp);
        finput << N << " " << M << "\n";
        for (auto &r : rooms)
        {
            for (auto c : r) finput << c << " ";
            finput << "\n";
        }
        finput.close();

        ofstream foutput(ofp);
        foutput << ans << "\n";
        foutput.close();
    }
    return 0;
}