#include<iostream>
using namespace std;
int main()
{
    int num, reverse = 0, remainder, temp;


    cin >> num;

    temp = num;

    while( temp != 0)
    {
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp = temp / 10;
    }
    cout<<reverse<<endl;
    if (num == reverse)
        cout << "YES" << endl;
    else
        cout <<"NO" << endl;
    return 0;
}

