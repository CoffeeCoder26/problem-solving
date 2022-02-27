#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	if(n>2 && n<1000)
 {
		for(int i=1; i<=10; i++)
	{
		cout<<i<<" * "<<n<<" = "<<i*n<<endl;
	}
 }
	
}
