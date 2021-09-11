#include<iostream>
using namespace std;
int main()
{
    long long x,y,z;
    cin>>x>>y>>z;

    if(x>=y && x>=z)
    {
        if(y>=z)
        {
            cout<<z<<"\n"<<x<<endl;
        }
        else
        {
            cout<<y<<"\n"<<x<<endl;
        }
    }

    else if(y>=x && y>=z)
    {
        if(x>=z)
        {
            cout<<z<<"\n"<<y<<endl;
        }
        else
        {
            cout<<x<<"\n"<<y<<endl;
        }
    }

    else if(z>=x && z>=y)
    {
        if(x>=y)
        {
            cout<<y<<"\n"<<z<<endl;
        }
        else
        {
            cout<<x<<"\n"<<z<<endl;
        }
    }
}
