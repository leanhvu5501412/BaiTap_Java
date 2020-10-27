/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_12 {

    public static void main(String[] args) {
        // nhap 2 chuoi A, B, string dapAn
        //Scanner sc = new Scanner(System.in);
        String A = "123456789";
        String B = "123456789";
        int soNguyen = 0;
        String dapAn = "";
        int i = A.length() >= B.length() ? A.length() - 1 : B.length() - 1;
        int j = (A.length() + B.length()) - i - 2;
        System.out.println("i = " + i + " j = " + j);
        int soDu = 0;
        if ((A.length() >= B.length()) == true) {
            while (j >= 0) {
                int nA = Integer.parseInt(Character.toString(A.charAt(i)));
                int nB = Integer.parseInt(Character.toString(B.charAt(j)));
                System.out.println("nA = " + nA + " nB = " + nB);
                int num = nA + nB;
                
                if (num >= 10) {
                    if (soDu > 0) {
                        dapAn = dapAn + ((num+ 1)) + "";
                    } else {
                        dapAn = dapAn + num + "";
                    }
                    soDu = num % 10;
                } else {
                    if (soDu > 0) {
                        dapAn = dapAn + ((num + 1)) + "";
                    } else {
                        dapAn = dapAn + (num) + "";
                    }
                }
                i--;
                j--;
            }
            while (i >= 0) {
                int nA = Integer.parseInt(Character.toString(A.charAt(i)));
                dapAn = dapAn + nA + "";
                i--;
            }
        }
        String temp = "";
        for (int k = dapAn.length() - 1; k >= 0; k--) {
            temp += dapAn.charAt(k) + "";
        }
        System.out.println("Dap an = " + temp);
    }
}
