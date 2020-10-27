/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_6;

/**
 *
 * @author PC
 */
public class Bai_6 {
    public static void main(String[] args) {
        // MMCCXXXVIII = 2238
        // MMCCXXXVII = 2237
        
        // La Ma sang Thap Phan
        System.out.println(LM_to_TP("MMCCXXXVIII"));
        
        // Thap Phan sang La Ma
        System.out.println(TP_toLM(2237));
    }
    //Ham chuyen doi so la ma sang thap phan
    public static int LM_to_TP(String s) {
        int len = s.length();
        int total = 0;
        for (int i = 0; i < len; i++) {
            if((i+1 < len)) {
                if ((s.charAt(i) == 'I') && (s.charAt(i + 1) == 'V')){
                    total += 4;
                    i++;
                    continue;
                }
                if ((s.charAt(i) == 'I') && (s.charAt(i + 1) == 'X')){
                    total += 9;
                    i++;
                    continue;
                }
                if ((s.charAt(i) == 'X') && (s.charAt(i + 1) == 'L')){
                    total += 40;
                    i++;
                    continue;
                }
                if ((s.charAt(i) == 'X') && (s.charAt(i + 1) == 'C')){
                    total += 90;
                    i++;
                    continue;
                }
                if ((s.charAt(i) == 'C') && (s.charAt(i + 1) == 'D')){
                    total += 400;
                    i++;
                    continue;
                }
                if ((s.charAt(i) == 'C') && (s.charAt(i + 1) == 'M')){
                    total += 900;
                    i++;
                    continue;
                }
            }
            switch(s.charAt(i)){
                case 'M':total += 1000; break;
                case 'D':total += 500;break;
                case 'C':total += 100;break;
                case 'L':total += 50;break;
                case 'X':total += 10;break;
                case 'V':total += 5;break;
                case 'I':total += 1;break;
            }
        }
        return total;
    }
    
    //Ham chuyen doi so thap phan sang la ma
    public static String TP_toLM(int num){
        String s = "";
        
        while(num >= 1000) {
            num -= 1000;
            s += "M";
        }
        if (num >= 900) {
            num -= 900;
            s += "CM";
        }
        while(num >= 500) {
            num -= 500;
            s += "D";
        }
        if (num >= 400) {
            num -= 400;
            s += "CD";
        }
        while(num >= 100) {
            num -= 100;
            s += "C";
        }
        if (num >= 90) {
            num -= 90;
            s += "XC";
        }
        while(num >= 1000) {
            num -= 50;
            s += "L";
        }
        if (num >= 40) {
            num -= 40;
            s += "XL";
        }
        while(num >= 10) {
            num -= 10;
            s += "X";
        }
        if (num >= 9) {
            num -= 9;
            s += "IX";
        }
        while(num >= 5) {
            num -= 5;
            s += "V";
        }
        if (num >= 4) {
            num -= 4;
            s += "IV";
        }
        while(num >= 1) {
            num -= 1;
            s += "I";
        }
        return s;
    }
}
