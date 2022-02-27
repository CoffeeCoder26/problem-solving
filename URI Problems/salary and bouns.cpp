#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	string name;
	double X,Y;
	cin>>name>>X>>Y;
	cout<<name<<endl;
	cout<<fixed<<setprecision(2)<<"TOTAL = "<<(X+(Y*15/100))<<endl;
}
