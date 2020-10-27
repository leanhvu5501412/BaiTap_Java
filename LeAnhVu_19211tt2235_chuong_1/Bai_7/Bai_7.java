/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BMI = 0;
        double weightInPounds = 0;
        double heightInInches = 0;
        
        System.out.println("Nhap weight In Pounds: ");
        weightInPounds = input.nextInt();
        System.out.println("Nhap height in inches: ");
        heightInInches = input.nextInt();
        
        BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
        System.out.println("BMI = " + BMI + " =>> ");
        if (BMI < 18.5) {
            System.out.println("Underweight : < 18.5");
        } else if (18.5 <= BMI && BMI < 24.9) {
            System.out.println("Normal: [18.5 - 24.9]");
        } else if (24.9 <= BMI && BMI < 29.9) {
            System.out.println("Overweight: [25 - 29.9]");
        } else {
            System.out.println("Obese: >=30");
        }
    }
}
