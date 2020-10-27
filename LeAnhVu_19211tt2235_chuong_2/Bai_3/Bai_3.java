/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int sumOdd = 0;
        int sumEven = 0;
        System.out.println("Nhap n: ");
        n = input.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                sumEven += i;
            else sumOdd += i;
        }
        
        System.out.println("Tong chan: " + sumEven);
        System.out.println("Tong le: " + sumOdd);
    }
}
