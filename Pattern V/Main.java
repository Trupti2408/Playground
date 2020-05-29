#include <iostream> 
using namespace std; 
int main() 
{ 
  int num,l=2; 
  int space; 
  int i, j, lterm, rterm;
  lterm = 1;
  cin>>num;
  rterm = num * num + 1;
  for (i = num; i > 0; i--) 
  { 
    if(i<num){
    for (space = 1; space <= l; space++) 
      cout << "-"; 
      l=l+2;}
    for (j = 1; j <= i; j++)
    { 
      cout << lterm; 
      cout << "*"; 
      lterm++;
    } 
    for (j = 1; j <= i; j++)
    { 
      cout << rterm;
      if (j < i) 
        printf("*");
      rterm++; 
    } 
    rterm = rterm - (i - 1) * 2 - 1;
    cout << endl; 
    } 
} 