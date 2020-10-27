/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0;
        System.out.print("Nhap k (2 <= k <= 9): ");
        k = input.nextInt();
        System.out.println("");   
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= k; j++) {
                System.out.print(i + " + " + j + " = " + (i * j) + "\t");
            }
            System.out.println("");
        }
    }
}
