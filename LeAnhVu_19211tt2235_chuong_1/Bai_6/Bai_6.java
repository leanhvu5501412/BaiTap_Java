/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 1;
        System.out.println("Lua chon: \n 1. C to F \n2. F to C");
        choose = input.nextInt();
        System.out.println("Nhap so de chuyen doi: ");
        int number = input.nextInt();
        System.out.println("number = " + number);
        if (choose == 1) {
            double C = 5.0 / 9.0 * (number - 32);
            System.out.println("C = " + C);
        } else if (choose == 2){
            double F = 9.0 / 5.0 * number + 32;
            System.out.println("F = " + F);
        }
    }
}
