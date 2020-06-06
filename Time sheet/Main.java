#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,h,x,z,y;
  std::cin>>a>>b>>c>>d>>e>>f>>h;
  x=a+b+c+d+e+f+h;
  y=x*100;
  z=b+c+d+e+f;
  if(b>8)
    y=y+(b-8)*15;
  if(c>8)
    y=y+(c-8)*15;
  if(d>8)
    y=y+(d-8)*15;
  if(e>8)
    y=y+(e-8)*15;
  if(f>8)
    y=y+(f-8)*15;
  if(z>40)
    y=y+(z-40)*25;
  if(a>0)
    y=y+50*a;
  if(h>0)
    y=y+25*h;
  std::cout<<y;
    
}