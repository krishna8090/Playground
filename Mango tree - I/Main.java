#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=a*b;
  if(c<=b)
    std::cout<<"Yes";
  else if(d-a<c)
    std::cout<<"Yes";
  else if (c%a==1)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
