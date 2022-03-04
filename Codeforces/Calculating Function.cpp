#include <bits/stdc++.h>
using namespace std;
void AboAgiza()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

int main()
{
    AboAgiza();
    long long  n;
    cin>>n;
    if(n%2==0)
        cout<<(n/2);
    else
        cout<<-1*(n/2 +1);


}
