#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
   double A,B,C;
   cin>>A>>B>>C;
   cout<<fixed<<setprecision(3)<<"TRIANGULO: "<<0.5*A*C<<endl;
   cout<<fixed<<setprecision(3)<<"CIRCULO: "<<3.14159*C*C<<endl;
   cout<<fixed<<setprecision(3)<<"TRAPEZIO: "<<((A+B)/2)*C<<endl;
   cout<<fixed<<setprecision(3)<<"QUADRADO: "<<B*B<<endl;
   cout<<fixed<<setprecision(3)<<"RETANGULO: "<<A*B<<endl;
}
