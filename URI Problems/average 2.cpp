#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	float average;
	float A,B,C;
	cin>>A>>B>>C;
	if((A>=0 && A<=10.0 )&& (B>=0 && B<=10.0 )&& (C>=0 && C<=10.0))
	{
		A=A*2;
		B=B*3;
		C=C*5;
		average=(A+B+C)/(2+3+5);
	}
	cout<<fixed<<setprecision(1)<<"MEDIA = "<<average<<endl;
}
