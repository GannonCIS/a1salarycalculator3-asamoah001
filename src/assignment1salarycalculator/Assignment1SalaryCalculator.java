/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SalaryCalculator cals = new SalaryCalculator();
        cals.calcSalary(24);
        cals.calcHourlyWage(50000);
        cals.calcTaxes(50000,7);
        cals.afterTax(50000,7);
        
    }
    
}
