#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  std::cin>>a>>b;
  c=13.30;
  if(b==c)
  { if(a>13)
    std::cout<<"$5.00";
      else
        std::cout<<"$2.00";
  }
  else
  {if(a>13)
    std::cout<<"$8.00";
      else
        std::cout<<"$4.00";
  }
      
 }