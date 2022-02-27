#include<iostream>
#include<iomanip>
#include<cmath>
#include<algorithm>
using namespace std;

int main()
{
	float x1,x2,y1,y2,a,b;
	cin>>x1>>y1>>x2>>y2;
	a=(x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
	b=sqrt(a);

	cout<<fixed<<setprecision(4)<<b<<endl;
}
