#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  int m,n,o;
  int p,q,r;
  cin>>a>>b>>c;
  cin>>m>>n>>o;
  cin>>p>>q>>r;
  int flipkart=a+c-((a*b)/100);
  int snapdeal=m+o-((m*n)/100);
  int amazon=p+r-((p*q)/100);
  cout<<"In Flipkart Rs."<<flipkart;
  cout<<"\nIn Snapdeal Rs."<<snapdeal;
  cout<<"\nIn Amazon Rs."<<amazon;
  if(flipkart<amazon&&flipkart<=snapdeal)
    cout<<"\nHe will prefer Flipkart";
  else if(snapdeal<amazon&&snapdeal<flipkart)
    cout<<"\nHe will prefer Snapdeal";
  else 
    cout<<"\nHe will prefer Amazon";
  
  
}