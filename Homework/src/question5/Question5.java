/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Lenovo
 */
public class Question5 {

    public static double calculateSalary(int years, double base) {

        double salary;

        if (years <= 5) {

            salary = base;
        } else {

            if (1 + (years - 5) * 0.1 > 2) {

                salary = 2 * base;

            } else {
                salary = base * (1 + (years - 5) * 0.1);
            }

        }
        return salary;
    }

    public static void main(String[] args) {
        
        System.out.println(" " + calculateSalary(8,2000.0));
    }

}
