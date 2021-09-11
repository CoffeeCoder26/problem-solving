#include<iostream>
using namespace  std;
int main()
{
    long long A,B,C,D,Result;
    cin>>A>>B>>C>>D;

    Result = ((A % 100) * (B % 100) * (C % 100) * (D % 100)%100);
    if(Result < 10)
    {
        cout<<0;
    }

    cout<<Result<<endl;


    return 0;
}
