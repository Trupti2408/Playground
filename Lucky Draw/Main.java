#include <iostream>  
using namespace std;  
int main()  
{
  int n,i;
  cin>>n;
  if(n==1)
  {
    cout<<"Not eligible";
  }
  else
  {
    if(n==2)
    {
      cout<<"Eligible";
    }
    else
    {
      for(i=3;i<n;i++)
      {
        if(n%i!=0)
        {
          cout<<"Eligible";
          break;
        }
        else
        {
          cout<<"Not eligible";
          break;
        }
       }
    }
  }
}