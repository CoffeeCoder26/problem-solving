#include<iostream>
using namespace std;

int main()
{
	int t,n,c1=0,c2=0;
	cin>>t;
	for(int i=1; i<=t; i++)
	{
		cin>>n;
		if(n>=10 && n<=20)
		{
			c1++;
		}
		else
		{
			c2++;
		}
	}
	cout<<c1<<" in"<<endl;
	cout<<c2<<" out"<<endl;
}
