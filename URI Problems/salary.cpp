#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int X,Y;
	float Z,salary;
	cin>>X>>Y>>Z;
	salary=Y*Z;
	cout<<"NUMBER = "<<X<<endl;
	cout<<fixed<<setprecision(2)<<"SALARY = U$ "<<salary<<endl;
}
