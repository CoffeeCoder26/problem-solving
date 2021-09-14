#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int x,y,sum = 0;
    while(cin>>x>>y)
    {
        if(x <= 0 || y <= 0)
        {
            break;
        }
        if(x > y)
        {
            int temp = x;
            x = y;
            y = temp;
        }
        sum = 0;
        for(int i = x; i <= y ; i++)
        {

            cout<<i<<" ";
            sum += i;

        }
        cout<<"sum ="<<sum<<endl;


    }
}
