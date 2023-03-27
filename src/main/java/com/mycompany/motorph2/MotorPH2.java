/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.motorph2;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Cha
 */
public class MotorPH2 {
    public int testEmployeeNumber(){
        Scanner inputscan = new Scanner(System.in);
        Data data = new Data();
     
        
        System.out.println("Enter Employee Number: ");
        int n=0;       
        boolean success = false;        
        while(!success){
            
            try{
                int input = inputscan.nextInt();// save user output to variable enterNum
                n = input-10001;
                int arrayTest = data.empNum[n];// to test if given employee number is within array                                              
                success=true;               
            }
            catch(Exception e){
                System.out.println("Employee number is invalid. Enter new Employee Number: ");
                inputscan.nextLine();
            }
        }
        return n;
    }
    
    public static void main(String[] args) throws ParseException {
        MotorPH2 m2 = new MotorPH2();
        Attendance attend = new Attendance();
        Deductions ded = new Deductions();
        
        Data data = new Data();                       
        int ind = m2.testEmployeeNumber();
        data.printDetails(ind);
        float hw = attend.computeHoursWorked(ind);
        
        
        
          

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------"); 
        System.out.println("PAYSLIP");            
        System.out.println();
        System.out.println("Name:\t\t"+data.lastName[ind]+","+data.firstName[ind]);//get names using the file handling
        System.out.println("Position:\t"+data.position[ind]);  
        System.out.println("Salary Period: "+attend.inputDate[0]+" to "+attend.inputDate[1]); 
        System.out.println();
        System.out.println();
        System.out.println("EARNINGS");
        System.out.println("(Note: Salary Earned is temporarily based on hourly rate)");
        System.out.println();
        float salary =  data.sal[ind]/(21*8)*hw;// compute salary using hours worked
        System.out.println("Salary Earned for the Period: "+salary);
        System.out.println();    
        System.out.println();


        System.out.println("Benefits");// gets value from all the Data class using array indexing
        System.out.println("Rice Subsidy:\t\t"+data.rice[ind]);
        System.out.println("Phone Allowance:\t"+data.phone[ind]); 
        System.out.println("Clothing Allowance:\t"+data.cloth[ind]);
        float benefits = data.rice[ind]+ data.phone[ind]+data.cloth[ind];

        System.out.println();

        float gs = benefits+salary;
        System.out.println("Gross Salary:\t\t"+ gs);

        System.out.println();
        System.out.println("DEDUCTIONS");
        //System.out.println("Late:\t");
        //System.out.println("Absences:\t");
        System.out.println();
        System.out.println("Government Deductions");
        System.out.println("SSS:\t\t"+ded.computesss(ind));
        System.out.println("Philhealth:\t"+ded.computeph(ind));
        System.out.println("Pag-IBIG:\t"+ded.computepg(ind));
        System.out.println();
        System.out.println("Taxable Income:   "+ded.computetaxable(ind));
        System.out.println("Withholding Tax:  "+ded.computetax(ind));
        System.out.println();
        
        System.out.println("Total Deductions: "+ded.computeTotalDeduction(ind));
        System.out.println();
        System.out.println();

        float net = gs-ded.computeTotalDeduction(ind);// applies deduction and saves to variable net
        System.out.println("Net Salary:       "+net);    
        
        
    }
}
