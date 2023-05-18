/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author Thành Vinh
 */
public class BMIcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runningCaculator();
    }

    public static void menu() {
        System.out.println("=======Calculator Program========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.println("Please choice one option: ");
    }

    public static void runningCaculator() {
        Calculate cal = new Calculate();
        Validate check = new Validate();
        

        while (true) {
            menu();
            int choose = check.getInt("Choose 1-3: ", 1, 3);

            switch (choose) {
                case 1:
                    cal.caculate();
                    break;
                case 2:
                    cal.caculateBMI();
                    break;
                case 3:
                    return;
            }
        }
    }

}
