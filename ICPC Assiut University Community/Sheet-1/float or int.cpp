#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    float x,result;
    cin>>x;
    int n = x;
    result = x-n;

    if(result==0)
    {
        cout<<"int "<<n<<endl;
    }
    if(result>0)
    {
        cout<<"float "<<n<<" "<<fixed<<setprecision(3)<<x-n<<endl;
    }
}
