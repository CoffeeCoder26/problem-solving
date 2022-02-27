#include<iostream>
using namespace std;

int main()
{
	int x1,x2,x3,x4;
	cin>>x1>>x2>>x3>>x4;
	if((x3>x1) && (x4>x2))
	{
		cout<<"O JOGO DUROU "<<(x3-x1)<<"HORA(S) E "<<(x4-x2)<<" MINUTO(S)"<<endl;
	} 
	/*if((x3==x1) && (x4==x2))
	{
		cout<<"O JOGO DUROU "<<24-(x3-x1)<<"HORA(S) E "<<(x4-x2)<<" MINUTO(S)"<<endl;
	}
	if((x3>x1) && (x4<x2))
	{
		cout<<"O JOGO DUROU "<<(x3-x1)<<"HORA(S) E "<<24-(x2-x4)<<" MINUTO(S)"<<endl;
	}*/
	return 0;
}
