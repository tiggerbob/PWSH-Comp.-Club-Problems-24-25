#include <bits/stdc++.h>

using namespace std;

const int N_NUM = 4;

const int YEAR_EQUIVALENTS[] = {2225, 2125, 2025, 1925};

int main()
{
    int N;
    cin >> N;

    string years[N_NUM];
    for (int i = 0; i < N_NUM; i++) cin >> years[i];

    double A[N_NUM][N_NUM + 1] = {}; // Coeff matrix - doubles for f.p. division
    unordered_map<char, int> numeralIdx; // Which index in equations each numeral corresponds to
    double dValues[N_NUM]; // Values corresponding to numeralIdx
    int values[N_NUM];

    // Set up last col of aug matrix (A)
    for (int i = 0; i < N_NUM; i++) A[i][N_NUM] = YEAR_EQUIVALENTS[i];

    // Set up equations
    for (int i = 0; i < N_NUM; i++)
    {
        int j = 0;
        for (char c : years[i])
        {
            if (!numeralIdx.count(c)) numeralIdx[c] = j++;
            A[i][numeralIdx[c]] += 1;
        }
    }

    // Reduce A into row echelon form
    for (int k = 0; k < N_NUM; k++)
    {
        // Find pivot
        int i_max = k;
        int v_max = A[i_max][k];
        for (int i = k + 1; i < N_NUM; i++)
            if (abs(A[i][k]) > v_max)
                v_max = A[i][k], i_max = i;

        if (i_max != k)
            // Swap row
            for (int m = 0; m <= N_NUM; m++) swap(A[k][m], A[i_max][m]);

        for (int i = k + 1; i < N_NUM; i++)
        {
            double f = A[i][k] / A[k][k];
            for (int j = k + 1; j <= N_NUM; j++) A[i][j] -= A[k][j] * f;
            A[i][k] = 0;
        }
    }

    // Backward substitution
    for (int i = N_NUM - 1; i >= 0; i--)
    {
        dValues[i] = A[i][N_NUM];

        for (int j = i + 1; j < N_NUM; j++) dValues[i] -= A[i][j] * dValues[j];

        dValues[i] = dValues[i] / A[i][i];
    }
    // cast f.p. dValues to int, avoiding round-down errors
    for (int i = 0; i < N_NUM; i++) values[i] = dValues[i] + 0.5;

    // Decode strike points
    for (int i = 0; i < N; i++) {
        int strikePointValue = 0;
        string strikePoint; cin >> strikePoint;
        for (char c : strikePoint) strikePointValue += values[numeralIdx[c]];
        cout << strikePointValue << endl;
    }

    return 0;
}
