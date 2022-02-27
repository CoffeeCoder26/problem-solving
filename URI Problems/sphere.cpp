#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    float R;
    cin>>R;
    cout<<fixed<<setprecision(3)<<"VOLUME = "<<3.14159*(4/3.0)*R*R*R<<endl;
}
