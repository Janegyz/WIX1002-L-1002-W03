/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

public class Q1  {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int a = input.nextInt();
            
            System.out.print("Enter second integer: ");
            int b = input.nextInt();
            
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = input.next().charAt(0);
            
            switch (op) {
                case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
                case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
                case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Error: division by zero.");
                    } else {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    }
                }
                case '%' -> {
                    if (b == 0) {
                        System.out.println("Error: division by zero.");
                    } else {
                        System.out.println(a + " % " + b + " = " + (a % b));
                    }
                }
                default -> System.out.println("Error: invalid operator '" + op + "'.");
            }
        }
    }
}


