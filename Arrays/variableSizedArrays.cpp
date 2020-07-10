#include <iostream>

using namespace std;

/* SUJET :
The first line contains two space-separated integers denoting the respective values of n (the number of variable-length arrays) and q (the number of queries).
Each line i of the n subsequent lines contains a space-separated sequence in the format k a[i]0 a[i]1 … a[i]k-1 describing the k-element array located at a[i].
Each of the q subsequent lines contains two space-separated integers describing the respective values of i (an index in array a) and j (an index in the array referenced by a[i]) for a query.
*/

int main() {
    int n;
    int q;
    cin >> n >> q;

    // tableau de pointeurs qui pointent vers des tableaux d'entiers (taille dynamique)
    int** tab = new int*[n];

    // on remplit chaque index du tableau avec un tableau à taille variable
    for(int i = 0; i < n; i++) {
        int k;
        cin >> k; // taille du tableau

        // création d'un tableau de taille k à l'index i
        tab[i] = new int[k];

        // remplissage des cellules
        for(int j = 0; j < k; j++) {
            cin >> tab[i][j];
        }
    }

    // requêtes
    while(q-- > 0) {
        int tabNumber;
        int index;
        cin >> tabNumber >> index;

        // on affichage la valeur demandée
        cout << tab[tabNumber][index] << endl;
    }

    return 0;
}


