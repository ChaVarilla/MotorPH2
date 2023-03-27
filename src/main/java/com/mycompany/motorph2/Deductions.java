/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph2;

/**
 *
 * @author Cha
 */
public class Deductions {
    Data data = new Data();
    
    public double computesss(int n){
        
        double sss;// if-elseif-else statement is to check the category of the salary  
            if(data.sal[n]<=3250){
                sss = 135;
            }
            else if(data.sal[n]>3250 & data.sal[n]<=24750) {
               if(data.sal[n]%1000==250 |data.sal[n]%1000==750 ){// this check whether the salary is in the lower/upper bound of range. 
                   float mod = (data.sal[n]-3250)%500; // after deducting 3250, in every 500 increment, the sss increases by 22.5
                    float multiplier = ((data.sal[n]-3250-mod)/500);              
                    sss = 22.5*(multiplier)+135;                        
               }
                else{// this applies the normal formule is salary falls within the range
                    float mod = (data.sal[n]-3250)%500; 
                    float multiplier = ((data.sal[n]-3250-mod)/500);              
                    sss = 22.5*(multiplier+1)+135;           
               }
            }
            else{
                sss = 1125;
            }    
            
            return sss;  
    }
    public double computeph(int n){
           double ph;
          
           if(data.sal[n]<=10000){//if-elseif-else statement checks the range of salary and applies formula in each range
               ph = 300/2;
               
           }
           else if (data.sal[n]>10000 & data.sal[n]<60000){
               ph = data.sal[n]*(0.03)/2;
           }
           else{
               ph = 1800/2;
           }

            
            
            return ph;
    }
    
    public double computepg(int n){
        double pagibig;
        
        if(data.sal[n]>1000 & data.sal[n]<=1500){//if-else statement checks the range of salary and applies formula in each rang
            pagibig = data.sal[n]*(float)0.01;
        } 
        else{
            if(data.sal[n]*0.02 <100){// this nested if-else statement provides the pagibig to be 100 if the values exceeds 100
              pagibig= data.sal[n]*(float)0.02;
            }
            else{
                pagibig = 100;
            }
        }


           
        
        return pagibig;    
    
    }
    public double computetaxable(int n){
        double taxable = data.sal[n]-computesss(n)-computepg(n)-computeph(n);// saves all the deduction to get taxable income and save to variable taxable
        
        return taxable;
    
    }
    public float computetax(int n){
           double tax;
            
            if(data.sal[n] <=20832){//if-elseif-else statement checks the range of taxable income and applies formula in each range 
                tax = 0;
            }
            else if(data.sal[n]>20832 & data.sal[n]<33333){
                tax = (computetaxable(n)-20833)*0.2;               
            }
            else if(data.sal[n]>=33333 & data.sal[n]< 66667){
                tax = (computetaxable(n)-33333)*0.25+2500;
            }
            else if(data.sal[n]>=66667 & data.sal[n]< 166667){
                tax = (computetaxable(n)-66667)*0.3+10833;
            }
            else if(data.sal[n]>=166667 & data.sal[n]< 666667){
                tax = (computetaxable(n)-166667)*0.32+40833.33;
            }
            else{
                tax = (data.sal[n]-666667)*0.35+200833.33;
            }
           
            return (float) 
                    tax;
    }
    
    public float computeTotalDeduction(int n){
        float td = (float)(computesss(n)+computeph(n)+computepg(n)+computetax(n));
        return td;
    }
    
    
}
