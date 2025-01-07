#include <bits/stdc++.h>

using namespace std;

int N, M, ans;
pair<int, int> start;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cin >> N >> M;

    bool rooms[N][M], visited[N][M]; // Could also init outside main with max constraints

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            char roomType; cin >> roomType;
            if (roomType == '@') {
                start = {i, j};
                rooms[i][j] = true;
            }
            else if (roomType == '.') rooms[i][j] = true;
            else rooms[i][j] = false;
            visited[i][j] = false;
        }
    }

    // Simple BFS floodfill implementation - recursive also works
    queue<pair<int, int>> q; q.push(start);
    int i, j;
    while (!q.empty())
    {
        i = q.front().first;
        j = q.front().second;
        q.pop();

        if (i < 0 || i >= N || j < 0 || j >= M || !rooms[i][j] || visited[i][j]) continue;

        visited[i][j] = true;
        ans++;
        
        // Visit edge-adjacent rooms
        q.push({i - 1, j});
        q.push({i + 1, j});
        q.push({i, j - 1});
        q.push({i, j + 1});
    }

    cout << ans << endl;
    return 0;
}