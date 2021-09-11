#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	
	for(int i=2; i<=n; i++)
	{
		for(int k=2; k<=i; k++)
		{
			if(i%k==0){
				break;
			}
			else if(i== k+1){
				cout<<i<<" ";
			}
		}
	}

}
