#include<iostream>
#include<string>
using namespace std;

int main()
{
    string s;
    cin>>s;
    if(s==',')
    {
        cout<<" ";
    }
    if(s>='A' && s<='Z')
    {
        cout<<(s+32)
    }
    if(s>='a' && s<='z')
    {
        cout<<(s-32);
    }
}
