#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char name[50];
  gets(name);
  int a=strlen(name);
  cout<<"The number of letters in the name is "<<a;
  
}