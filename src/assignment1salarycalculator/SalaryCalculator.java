/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author PaulGee
 */
public class SalaryCalculator {
    
    public int calcHourlyWage(int salary){
        int hourWage = salary/(52*40);
        System.out.println("Hourly Wage is " + hourWage);
        return hourWage;
    }
    public int calcSalary(int hourlyRate){
        int salary = hourlyRate * (52*40);
        System.out.println("Salary is " + salary);
        return salary;
    }   
     public double calcTaxes(double salary, double perc){
        double taxes = salary * (perc/100);
        System.out.println("Taxes Are " + taxes);
        return taxes;
    }
     public double afterTax(double salary, double perc){
        double takeHome = salary - ((perc/100)*salary);
        System.out.println("Cash Out Is " + takeHome);
        return takeHome;
    }
}

   

