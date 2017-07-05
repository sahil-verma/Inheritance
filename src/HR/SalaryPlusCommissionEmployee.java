/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

/**
 *
 * @author sahil
 */
public class SalaryPlusCommissionEmployee extends CommissionEmployee{
    private double salary;
    
    public SalaryPlusCommissionEmployee(String firstName, String lastName, double commissionRate, double salary){
        super(firstName, lastName, commissionRate);
        this.salary = salary;
        
    }

    public double getSalary() {
        return this.salary;
    }
    @Override
    public String toString(){
       return super.toString()
               + " " + 
               this.getSalary();
    }
}
