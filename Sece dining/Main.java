#include<iostream>
using namespace std;
int main()
{
  string s;
  int r;
  cin>>s>>r;
  if(s=="front")
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  else
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
}