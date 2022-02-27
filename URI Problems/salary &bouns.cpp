#include<iostream>
#include<iomanip>
#include<string>
using namespace std;
int main()
{
	string name;
	cin>>name;
	double X,Y,TOTAL;
	cin>>X>>Y;
    TOTAL=(X+(Y*15/100));
    
	cout<<name<<endl;
	cout<<fixed<<setprecision(2)<<"TOTAL = R$ "<<TOTAL<<endl;
}
