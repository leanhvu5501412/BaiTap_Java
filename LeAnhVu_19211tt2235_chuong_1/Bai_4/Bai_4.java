/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = 0;
        int length = 0;
        int area = 0;
        double primeter = 0.0d;
        System.out.println("Enter your width: ");
        width = input.nextInt();
        System.out.println("Enter your width: ");
        length = input.nextInt();

        area = width * length;
        primeter = (width + length) * 2;
        //Area of Rectangle(25, 4) is 100Perimeter of Rectangle(25, 4) is 58
        System.out.println("Area of Rectangle(" + width + ", " + length + ") = " + area);
        System.out.println("Perimeter of Rectangle(" + width + ", " + length + ") = " + primeter);
    }
}
