#include<iostream>
#include<string>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str = "1+3+2";
    for(int i=0; i<str.length(); i++){
        if(str[i]%2==0)
            sort(str.begin(i), str.end(i));
    }

    cout<<str;
}
