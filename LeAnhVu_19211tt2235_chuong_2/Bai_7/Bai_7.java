/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Bai_7 {
    public static void main(String[] args) {
        // khai bao bien
        int max = 0;
        int min = 0;
        Random rd = new Random();
        int xiNgau[] = new int[6];
        // thuc hien random xi ngau
        for (int i = 0; i <= 8000; i++) {
            switch(rd.nextInt(6)) {
                case 0: xiNgau[0]++; break;
                case 1: xiNgau[1]++; break;
                case 2: xiNgau[2]++; break;
                case 3: xiNgau[3]++; break;
                case 4: xiNgau[4]++; break;
                case 5: xiNgau[5]++; break;
            }
        }
        // tim mat co so lan xuat hien nhieu nhat, it nhat
        for (int i = 1; i < 6; i++) {
            if (xiNgau[max] < xiNgau[i]) max = i;
            if (xiNgau[min] > xiNgau[i]) min = i;
        }
        // in so lan xuat hien cua xi ngau, va ket luan
        for (int i = 0; i < 6; i++) {
            if (xiNgau[max] == xiNgau[min]) { System.out.println("So lan xuat hien Min Max deu la = " + xiNgau[max]); break; }
            if (i == max || i == min) {
                if (i == max && xiNgau[max] == xiNgau[i])
                    System.out.println("So lan xuat hien cua  mat " + (max + 1) + " nut la: " + xiNgau[max] + " (La so lan xuat hien nhieu nhat)");
                if (i == min && xiNgau[min] == xiNgau[i])
                    System.out.println("So lan xuat hien cua  mat " + (min + 1) + " nut la: " + xiNgau[min] + " (La so lan xuat hien it nhat)");
            } else {
                System.out.println("So lan xuat hien cua  mat " + (i + 1) + " nut la : " + xiNgau[i]);
            }
        }
    }
}
