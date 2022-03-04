#include<bits/stdc++.h>
using namespace std;

void AboAgiza(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

int main(){
    AboAgiza();
    int k,s,z,ans=0; cin>>k>>s;

    for(int i=0; i<=k; i++){
        for(int j=0; j<=k; j++){
            z = s -(i+j);
            if(z<=k && z>=0)
                ans++;
        }
    }
    cout<<ans;
}
