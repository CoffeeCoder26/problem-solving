#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int a,b;
	float z;
	cin>>a>>b>>z;
	int c,d;
	float y;
	cin>>c>>d>>y;
	cout<<fixed<<setprecision(2)<<"VALOR A PAGAR: R$ "<<(b*z)+(d*y)<<endl;
}
