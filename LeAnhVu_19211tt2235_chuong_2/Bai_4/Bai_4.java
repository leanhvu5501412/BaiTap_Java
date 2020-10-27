/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4;

/**
 *
 * @author PC
 */
public class Bai_4 {
     public static void main(String[] args) {
        System.out.println("\t Binary \tOctal \tHexadecimal");
        for (int i = 1; i < 257; i++) {
            System.out.println(i);
            System.out.print("\t" + Integer.toBinaryString(i));
            System.out.print("\t\t" + Integer.toOctalString(i));
            System.out.println("\t" + Integer.toHexString(i));
        }
    }
}
