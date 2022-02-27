#include<iostream>
using namespace std;
int main()
{
	float x;
	cin>>x;
	if(x>0 && x<400.00)
	{
		cout<<"Novo salario: "<<x+(x*(15/100))<<"\n";
	}
}
