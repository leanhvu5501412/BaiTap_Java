/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int inpSeconds = 0;
        System.out.println("Enter amount of seconds: ");
        inpSeconds = input.nextInt();

        hours = inpSeconds / 3600;
        minutes = inpSeconds % 3600 / 60;
        seconds = inpSeconds % 3600 % 60;

        System.out.printf("%d : %d : %d", hours, minutes, seconds);
    }
}
