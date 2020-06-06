#include<iostream>
int main()
{int a,i=0;
 std::cin>>a;
 do
 {
   a=a/10;
   i++;
 }while(a>0);
 std::cout<<i;
}