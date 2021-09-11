#include<iostream>
using namespace std;
int main()
{
	char s;
	int x,n;
	cin>>s>>x;
	for(int i=1; i<=x; i++)
	{
		cin>>n;
		
		for(int j=1;j<=n; j++)
		{
			if(s=='+')
			{
			cout<<"+";
			cout<<endl;
			}
			else if(s=='-')
			{
				cout<<"-";
				cout<<endl;
			}
			else if(s=='*')
			{
				cout<<"*";
				cout<<endl;
			}
			else
			{
				cout<<"/";
				cout<<endl;
			}
			
		}
	}
}
