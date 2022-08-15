/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author arnol
 */
public abstract class Employee {
    private String firstName; 
    private String lastName; 
    private String socialSecurityNumber;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Employee(String oneName, String twoName, String socialSecNum){
    firstName = oneName;
    lastName = twoName;
    socialSecurityNumber = socialSecNum;
    }

    //Setters and Getters
    public void setFirstName(String oneName){
        firstName = oneName;
    }
    public String getFirstName(){
        return firstName;
    }
     public void setLastName(String twoName){
         lastName = twoName;
    }
    public String getLastName(){
        return lastName;
    }
     public void setsocialSecurityNumber(String socialSecNum){
        socialSecurityNumber = socialSecNum;
    }
    public String getsocialSecurityNumber(){
        return socialSecurityNumber;
    }
    @Override 
    public String toString() {
	return String.format("%s %s\nsocial security number: %s",
	getFirstName(), getLastName(), getsocialSecurityNumber());
    } 
    //Overidden by subclasses
    public abstract double earnings();
}
