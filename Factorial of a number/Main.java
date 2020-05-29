#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int mul=1;
  for(int i=1;i<=n;i++)
  {
    mul=mul*i;
  }
  std::cout<<mul;
}