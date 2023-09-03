
#include<iostream>
#include"Arithmetic.h"
using namespace std;

 int main()
 {
     
     int No1=0;
     int No2=0;
     
     int No=0;
     
     cout<<"Enter First Number"<<endl;
     cin>>No1;
     
     cout<<"Enter Second Number"<<endl;
     cin>>No2;
     
     No=Addition(No1,No2);
     cout<<"Addition is :";
      cout<<No<<endl;
      
     

     
     No=Subtraction(No1,No2);
     cout<<"Subtraction is :"<<No<<endl;
        
     
     
     
     
     No=Multiplication(No1,No2);
     cout<<"Multiplication is :";
    cout<<No<<endl;
     

     No=Division(No1,No2);
     cout<<"Division is :";
    cout<<No<<endl;
    
     

     
     return 0;
 }