#include<iostream>
using namespace std;

int main()
{
	int n,years=0,months=0,days=0;
	cin>>n;
	years = n / 365;
    n= n % 365;
	months = n / 30;
	days = n % 30;
	cout<<years<<" years"<<endl;	
	cout<<months<<" months"<<endl;	
	cout<<days<<" days"<<endl;	
	
}
