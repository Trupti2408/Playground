#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char name[50],name_rev[50];
  gets(name);
  gets(name_rev);
  char  temp;
	int i=0, j;
	
	j=strlen(name)-1;
	while(i<j)
	{
		temp=name[i];
		name[i]=name[j];
		name[j]=temp;
		i++;
		j--;
	}
  if(strcmp(name,name_rev)==0)
  {cout<<"It is correct";}
  else
    cout<<"It is wrong";
}