#include <bits/stdc++.h>
using namespace std;
 void AboAgiza()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

int main() {
    AboAgiza();
    long long X;
    cin >> X;
    cout << X/500*1000+X%500/5*5 << endl;
}
