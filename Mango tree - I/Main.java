#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n<c)
    cout<<"Yes";
  else if(n%c==0||n%c==1)
    cout<<"Yes";
  else
    cout<<"No";
}