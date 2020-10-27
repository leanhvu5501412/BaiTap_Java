/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int numResult = 0;
        
        System.out.print("Nhap min: ");
        min = input.nextInt();
        System.out.print("\nNhap max: ");
        max = input.nextInt();
        numResult = (int) (Math.random() * (max - min) + min);
        
        System.out.println("Ket qua: " + numResult);
    }
}
