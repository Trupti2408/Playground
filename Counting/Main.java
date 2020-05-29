#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here
  char str[200];
  gets(str);
  int l=strlen(str),vowel=0,white=0,digit=0,consonant=0,sym=0;
  for(int i=0;i<l;i++)
  {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
      vowel++;
    else if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z'))
            consonant++;
    else if(str[i]==' ')
            white++;
    else if(str[i]>='0' && str[i]<='9')
      	digit++;
    else
            sym++;
  }
  cout<<"Vowels:"<<vowel<<"\n";
  cout<<"Consonants:"<<consonant<<"\n";
  cout<<"White Spaces:"<<white<<"\n";
  cout<<"Digits:"<<digit<<"\n";
  cout<<"Symbols:"<<sym<<"\n";     
}