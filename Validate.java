/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);

    //check user input string
    public static String getString() {
        //loop until user input correct
        while (true) {
            String str = sc.nextLine().trim();
            if (str.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return str;
            }
        }
    }

    public int getInt(String message, int min, int max) {
        boolean flag = true;
        int number = 0;

        while (flag) {
            System.out.println(message);
            try {
                number = Integer.parseInt(getString());
                if (number >= min && number <= max) {
                    flag = false;
                } else {
                    System.out.println("Number out of range!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Number invalid!");
            }
        }

        return number;
    }

    public double getDouble(String message, double min, double max) {
        boolean flag = true;
        double number = 0;

        while (flag) {
            System.out.println(message);
            try {
                number = Double.parseDouble(getString());
                if (number >= min && number <= max) {
                    flag = false;
                } else {
                    System.out.println("Number out of range!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Number invalid!");
            }
        }

        return number;
    }

    public boolean checkInputYN() {
        while (true) {
            String result = getString();
            if (result.toUpperCase().equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.toUpperCase().equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public String getOperator() {

        while (true) {
            String operator = sc.nextLine();
            if (operator.isEmpty()) {
                System.out.println("Cannot empty");
            } else {
                switch (operator) {
                    case "+":
                        return operator;
                    case "-":
                        return operator;
                    case "*":
                        return operator;
                    case "/":
                        return operator;
                    case "^":
                        return operator;
                    case "=":
                        return operator;
                    default:
                        System.out.println("Please input (+, -, *, /, ^)");
                }
            }
        }

    }

}
