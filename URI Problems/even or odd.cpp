#include<iostream>
using namespace std;
int main()
{
	int T,N;
	cin>>T;
	for(int i=1; i<=T; i++)
	{
		cin>>N;
		if(N==0)
		{
			cout<<"NULL"<<endl;
		}
		
		else if(N>0)
		{
			if(N%2==0)
			{
				cout<<"EVEN POSITIVE"<<endl;
			}
			else
			{
				cout<<"ODD POSITIVE"<<endl;
			}
	    }
	    
		else if(N<0)
		{
			if(N%2==0)
			{
				cout<<"EVEN NEGATIVE"<<endl;
			}
			else 
			{
				cout<<"ODD NEGATIVE"<<endl;
			}
		}
	}
}
