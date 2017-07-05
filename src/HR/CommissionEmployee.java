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
public class CommissionEmployee extends Employee{
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, double commissionRate){
        super(firstName, lastName);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }
    @Override
    public String toString(){
       return super.getFirstName() + " " + super.getLastName() + " " + this.getCommissionRate();    
    }
}
