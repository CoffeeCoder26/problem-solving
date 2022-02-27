#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	float x,count=0,sum=0;
	
	for(int i=1; i<=6; i++)
	{
		cin>>x;
		if(x>0)
		{
			sum+=x;
			count++;
		}
		
	}
	    cout<<count<<" valores positivos"<<endl;
	    cout<<fixed<<setprecision(1)<<sum/count<<endl;

}

