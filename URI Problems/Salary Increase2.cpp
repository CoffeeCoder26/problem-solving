#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    float n;
    cin>>n;
    if(n>=0 && n<=400.00)
    {
        cout<<"Novo salario: "<<setprecision(2)<<(n+(n*15/100))<<"\n"<<"Reajuste ganho: "<<setprecision(2)<<(n*15/100)<<"\n";
    }

}
