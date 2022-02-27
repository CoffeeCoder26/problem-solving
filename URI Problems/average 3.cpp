#include<iostream>
#include<iomanip>
using namespace std;
int main()
{

    float N1,N2,N3,N4,N5,average,average2;
    cin>>N1>>N2>>N3>>N4;
    N1*=2;
    N2*=3;
    N3*=4;
    N4*=1;
    average=(N1+N2+N3+N4)/(2+3+4+1);
    cout<<fixed<<setprecision(1)<<"Media: "<<average<<endl;

    if(average>=7.0)
    {
        cout<<"Aluno aprovado."<<endl;
    }

    else if(average< 5.0)
    {
        cout<<"Aluno reprovado."<<endl;
    }

    else
    {
        cout<<"Aluno em exame."<<endl;

        cout<<"Nota do exame: ";
        cin>>N5;

        average2 = (average + N5)/2;

        if(average2>=5.0)
        {
            cout<<"Aluno aprovado."<<endl;
        }
        else
        {
            cout<<"Aluno reprovado."<<endl;
        }
        cout<<fixed<<setprecision(1)<<"Media final: "<<average2<<endl;
    }

    return 0;
}
