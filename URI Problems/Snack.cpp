#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
	float X,Y;
	cin>>X>>Y;
	if(X==1)
	{
		cout<<fixed<<setprecision(2)<<"Total: R$ "<<Y*4<<endl;
	}
		if(X==2)
	{
		cout<<fixed<<setprecision(2)<<"Total: R$ "<<Y*4.5<<endl;
	}
		if(X==3)
	{
		cout<<fixed<<setprecision(2)<<"Total: R$ "<<Y*5<<endl;
	}
		if(X==4)
	{
		cout<<fixed<<setprecision(2)<<"Total: R$ "<<Y*2<<endl;
	}
		if(X==5)
	{
		cout<<fixed<<setprecision(2)<<"Total: R$ "<<Y*1.5<<endl;
	}
	
	return 0;
}

