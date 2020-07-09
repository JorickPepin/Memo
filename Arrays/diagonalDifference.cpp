#include <iostream>

using namespace std;

int main()
{
    int matrixSize;

    cin >> matrixSize;

    int diag1Value = 0;
    int diag2Value = 0;

    int value;

    for(int i = 0; i < matrixSize; i++){
        for(int j = 0; j < matrixSize; j++){
            cin >> value;
            if(i == j){ // left diagonal
                diag1Value += value;
            }
            if(i+j == (matrixSize-1)){ // right diagonal
                diag2Value += value;
            }
        }
    }

    cout << abs(diag1Value-diag2Value) << endl;

    return 0;
}
