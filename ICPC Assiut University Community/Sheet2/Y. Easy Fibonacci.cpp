#include<iostream>
using namespace std;

int main()
{
    int f1 = 0, f2 = 1, i, n; cin>>n;

    if (n < 1)
        return 0;
    cout << f1 << " ";
    for (i = 1; i < n; i++) {
        cout << f2 << " ";
        int next = f1 + f2;
        f1 = f2;
        f2 = next;
    }
}
