#include<iostream>
using namespace std;


float grossPay,tax,netPay,answer,tax;
float payOut(float hours,float wage,float days);
int main(){
    cout<<"Enter the hourly wage and hours worked and days of work"<<endl;
    float hours,wage,days;
    cin>>hours>>wage>>days;
    answer = payOut(hours,wage,days);

    tax = payTax(answer);

    cout<<"The grouse pay is "<<answer;

     cout<<"The tax is "<<tax;
    return 0;
}

float payOut(float hours,float wage,float days){
    return wage*hours*days;
}

float payTax(float answer){
    float rem = answer - (answer*0.15);
    return rem;
}
    