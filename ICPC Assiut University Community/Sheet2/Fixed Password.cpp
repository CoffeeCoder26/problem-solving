#include<iostream>
using namespace std;
int main()
{
	long long x,c;
	
	for(int k=10e3; k<=(10e4)-1; k++)
	{
	    cin>>x;
		if(x==1999)
		{
			cout<<"Correct"<<endl;
			break;
		}
		else
		{
			cout<<"Wrong"<<endl;
		}
	}
}
