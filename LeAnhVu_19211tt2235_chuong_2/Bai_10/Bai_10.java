/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_10;

/**
 *
 * @author PC
 */
class ToaDo {

    private int X;
    private int Y;

    public ToaDo(int tungDo, int hoanhDo) {
        this.X = tungDo;
        this.Y = hoanhDo;
    }

    public double khoangCachToiGocToaDo() {
        return Math.sqrt((Math.pow(X, 2)) + ((Math.pow(Y, 2))));
    }

    public double khoangCachHaiDiem(ToaDo inpToaDo) {
        double ketQua = 0d;
        ketQua = Math.sqrt(Math.pow(inpToaDo.X - this.X, 2) + Math.pow(inpToaDo.Y - this.Y, 2));
        return ketQua;
    }
}

public class Bai_10 {

    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(2, 1);
        double kq = td1.khoangCachHaiDiem(new ToaDo(6, 4));
        System.out.println("kq = " + kq);
    }
}
