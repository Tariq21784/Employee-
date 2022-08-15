/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author arnol
 */
public class SalariedEmployee extends Employee{
      private double weeklySalary;
 
      
      public SalariedEmployee( String oneName, String twoName, String socialSecNum, double salary ){
        super( oneName, twoName, socialSecNum ); 
        setWeeklySalary( salary ); 
     } 

     //salary caculation
     public void setWeeklySalary( double salary ){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
     } 

    
     public double getWeeklySalary(){
        return weeklySalary;
     } 

     // calculate earnings; override abstract method earnings in Employee
     public double earnings(){
        return getWeeklySalary();
     } 

     
     public String toString(){
        return String.format( "salaried employee: %s\n%s: $%,.2f",
           super.toString(), "weekly salary", getWeeklySalary() );
     } 
  } 