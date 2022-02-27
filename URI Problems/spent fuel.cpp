#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double h,s,r;
    cin>>h>>s;
    r=(s/12)*h;
    cout<<fixed<<setprecision(3)<<r<<endl;

}
