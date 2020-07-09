#include <iostream>

using namespace std;

int main()
{
    int a,b;
    string list[]={"","one","two","three","four","five","six","seven","eight","nine"};
    cin >> a >> b;
    for(int i=a;i<=b;++i)
        cout << ((i <= 9)?list[i]:((i % 2 == 0)?"even":"odd")) << endl;

    return 0;
}

