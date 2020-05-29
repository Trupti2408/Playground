#include<iostream>
using namespace std;
int main() 
{
  int n,m,oddSum=0,evenSum=0;
  cin>>n;
  int flag=0;
  int counter=1;
  while (n!=0) 
  {
    if(counter%2==0)
    {
      evenSum += n % 10;
      n /= 10;
    }
    else
    {
      oddSum += n % 10;
      n /= 10;
    }
    counter++;
  }
  if(counter%2==0)
  {
    int temp=oddSum;
    oddSum=evenSum;
    evenSum=temp;
  }
  if(evenSum==oddSum)
    cout<<"Yes";
  else
    cout<<"No";
}