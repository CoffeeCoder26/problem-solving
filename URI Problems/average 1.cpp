#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    float A,B,average;
    cin>>A>>B;
    if (A>=0 && A<=10.0 && B>=0 && B<=10.0)
{
	A=A*3.5;
	B=B*7.5;
    average=(A+B)/(3.5 + 7.5);
}
    cout<<fixed<<setprecision(5)<<"MEDIA = "<<average<<endl;

    return 0;
}
