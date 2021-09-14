#include<iostream>

using namespace std;
int main()
{
    int n,Lines; cin>>n;
    string Word = "PUM";
    Lines = n*4;


    for(int i=1; i<=Lines; i++)
    {

        if(i%4==0)
           cout<<"PUM\n";
        else
            cout<<i<<" ";
    }
}
