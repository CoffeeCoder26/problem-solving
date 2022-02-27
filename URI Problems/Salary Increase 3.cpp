#include<iostream>
using namespace std;
int nain()
{
	float n;
	cin>>n;
	if(n>=0 && n<=400.00)
	{
		cout<<"Novo salario: "<<n+(n*15/100)<<"\n"<<"Reajuste ganho: "<<(n*15/100)<<"\n"<<"Em percentual: 15 %"<<endl;
	}
}
