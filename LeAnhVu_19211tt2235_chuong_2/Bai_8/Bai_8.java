/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_8 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int dapAn = 0;
        int c = 0;
        String aDung[] =  {
            "Very good!",
            "Excellent!",
            "Nice work!",
            "Keep up the good work!",
        };
        String aSai[] =  {
            "No. Please try again",
            "Wrong. Tru once more.",
            "Don't give up!",
            "Wrong. Keep trying.",
        };
        num1 = rd.nextInt(10) + 1;
        num2 = rd.nextInt(10) + 1;
        
        System.out.print(num1 + " + " + num2 + " = ");
        dapAn = sc.nextInt();
        c = rd.nextInt(4);
        if (dapAn == (num1 + num2))
            System.out.println(aDung[c]);
        else System.out.println(aSai[c]);
        
    }
}
