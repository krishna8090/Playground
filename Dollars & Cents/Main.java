#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  std::cin>>a>>b>>c>>d;
  e=a+c;f=b+d;
  if(f>100)
    e=e+(f/100);
  std::cout<<e<<"\n";
  std::cout<<f%100;
}