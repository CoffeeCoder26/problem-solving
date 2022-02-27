#include<iostream>
#include<string>
using namespace std;
int main()
{
    int n,x;
    string op;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>op;
        if(op[1]=='+')
        {
            x++;
        }
        else
        {
            x--;
        }

    }
    cout<<x<<endl;
}

