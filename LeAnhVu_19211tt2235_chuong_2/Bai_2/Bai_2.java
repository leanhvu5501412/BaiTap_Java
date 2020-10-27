/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        System.out.print("Nhap vao mot chuoi: ");
        input = sc.nextLine();
        
        
        String arrS[] = input.split(" ");
        String result = "";
        for (int i = 0; i < arrS.length; i++) {
            result += arrS[i].charAt(0);
        }
        System.out.println("Ket Qua = " + result);
    }
}
