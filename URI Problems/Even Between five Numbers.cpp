#include<iostream>
using namespace std;
int main()
{
	int n,count=0;
	for(int i=1; i<=5; i++)
	{
		cin>>n;
		if(n%2==0)
		{
			count++;
		}
		
	}
	   cout<<count<<" valores pares"<<endl;
}
