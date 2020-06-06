#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=a*b;
  if(c>=a && c<=2*a)
    std::cout<<"It is a mango tree";
  else if(d-a>=c && d-2*a<=c)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}