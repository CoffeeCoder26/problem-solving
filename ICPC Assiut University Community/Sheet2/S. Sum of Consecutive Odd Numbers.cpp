#include <iostream>
using namespace std;
int main()
{
    int tcase,a,b,temp,sum=0;
    cin>>tcase;
    for(int i=0; i<tcase; i++)
    {
        cin>>a>>b;
        if(a>b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        if(a % 2 == 0)
        {
            a--;
        }
        a += 2;


        for(int k=a; k<b; k+=2)
        {
            sum +=k;
        }
        cout<<sum<<endl;
        sum = 0;

    }
    return 0;
}
