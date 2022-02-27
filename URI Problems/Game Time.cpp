#include<iostream>
using namespace std;
int main()
{
	int x,y;
	cin>>x>>y;
	if(x>=y)
	{
       cout<<"O JOGO DUROU "<<24-(x-y)<<" HORA(S)"<<endl;
	}
	else
	{
		cout<<"O JOGO DUROU "<<(y-x)<<" HORA(S)"<<endl;
	}
	return 0;
}
