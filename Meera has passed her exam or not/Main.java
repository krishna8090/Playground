#include<iostream>
int main()
{
  int n,b,i,d=0;
  std::cin>>n;
  int a[n];
  for(i=0 ; i<n ;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>b;
  for(i=0 ; i<n ;i++)
  {
    if(a[i]==b)
     d=1;
     
  }
  if(d==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}