/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_8 {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so nguyen ! Hay nhap lai: ");
                input.nextLine();
            }
        }
        return n;
    }

    public static int TinhUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void Bai8() {
        System.out.println("Nhap a: ");
        int a = nhap();
        System.out.println("Nhap b: ");
        int b = nhap();
        System.out.printf("UCLN cua %d va %d la: %d \n", a, b, TinhUCLN(a, b));
        System.out.printf("BCNN cua %d va %d la: %d", a, b, (a * b) / TinhUCLN(a, b));
    }
}
