#include<bits/stdc++.h>
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
    int n,x=0,mx=0;
    string str;
    cin>>n>>str;

    for(int i=0; i<n; i++)
    {

        if (str[i]=='I')
            x++;
        else
            x--;

        mx = max(mx,x);
    }

    cout <<mx;


}
