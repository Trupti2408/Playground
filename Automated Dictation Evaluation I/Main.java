#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char a[50],b[50];
 gets(a);
  gets(b);
int result=strcmp(a,b);
 if(result==0)
 { cout<<"It is correct";}
  else
  {cout<<"It is wrong";}
}