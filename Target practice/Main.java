#include<iostream>
int main()
{
    int n,target,sum=0,c=0;
    std::cin>>target;
    while(1)
    {
      std::cin>>n;
      sum+=n;
      c++;
      if(sum>=target)
        break;
    }
  std::cout<<"The number of turns is "<<c;
  return 0;
}