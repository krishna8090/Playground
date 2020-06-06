#include<iostream>
int main(){
    int n,m,sum=0,a;
  std::cin>>n>>m;
  a=m+n;
  for(int i=1;i<a;i++)
  {
    if(a%i==0)
    {
      sum=sum+i;
    }
  }
    if(sum==m+n)
      std::cout<<"They can read the message";
    else
      std::cout<<"They can\'t read the message";

  }