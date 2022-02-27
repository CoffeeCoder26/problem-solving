#include<iostream>
using namespace std;
int main()
{
    int x,y,z;
    cin>>x>>y>>z;
    if(x<y || x<z || y<z)
    {
    	
    		cout<<x<<"\n"<<y<<"\n"<<z<<"\n";
		
    }
    
     if(y<x || y<z || x<z)
    {
    
    		cout<<y<<"\n"<<x<<"\n"<<z<<"\n";
		
    }
     if(z<x || z<y || y<z)
    {
    	
    		cout<<z<<"\n"<<y<<"\n"<<z<<"\n";
		
    }
    
	cout<<endl;
	cout<<x<<endl<<y<<endl<<z<<endl;

}
