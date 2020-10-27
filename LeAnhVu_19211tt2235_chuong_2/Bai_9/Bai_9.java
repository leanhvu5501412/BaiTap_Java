/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_9;

/**
 *
 * @author PC
 */
class PhanSo {

    // fields
    private int tuSo;
    private int mauSo;

    // constructors
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 0;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // methods
    // xuat phan so
    public void XuatPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }

    public int UCLN(int tu, int mau) {

        while (tu != mau) {
            if (tu > mau) {
                tu = tu - mau;
            } else {
                mau = mau - tu;
            }
        }
        return (tu);
    }

    // toi gian phan so
    public PhanSo ToiGianPhanSo() {
        int tu = UCLN(this.tuSo, this.mauSo);
        int ts = this.tuSo / tu;
        int ms = this.mauSo / tu;

        PhanSo ketqua = new PhanSo(ts, ms);

        return (ketqua);
    }

    // cong mot phan so khac
    public PhanSo CongMotPhanSoKhac(PhanSo psInput) {
        int ts = this.tuSo * psInput.mauSo + this.mauSo * psInput.tuSo;
        int ms = this.mauSo * psInput.mauSo;
        PhanSo ketqua = new PhanSo(ts, ms);
        return (ketqua);
    }

    // Tru mot phan so khac
    public PhanSo TruMotPhanSoKhac(PhanSo psInput) {
        int ts = this.tuSo * psInput.mauSo - this.mauSo * psInput.tuSo;
        int ms = this.mauSo * psInput.mauSo;
        PhanSo ketqua = new PhanSo(ts, ms);
        return (ketqua);
    }

    public PhanSo NhanMotPhanSoKhac(PhanSo psInput) {
        int ts = this.tuSo * psInput.tuSo;
        int ms = this.mauSo * psInput.mauSo;
        PhanSo ketqua = new PhanSo(ts, ms);
        return (ketqua);
    }

    public PhanSo ChiaMotPhanSoKhac(PhanSo psInput) {
        int ts = this.tuSo * psInput.mauSo;
        int ms = this.mauSo * psInput.tuSo;
        PhanSo ketqua = new PhanSo(ts, ms);
        return (ketqua);
    }
}

public class Bai_9 {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2, 3);

        PhanSo pstg = ps1.ToiGianPhanSo();
        pstg.XuatPhanSo();

        PhanSo congPS = ps1.CongMotPhanSoKhac(new PhanSo(1, 2));
        congPS.XuatPhanSo();

        PhanSo truPS = ps1.TruMotPhanSoKhac(new PhanSo(1, 2));
        truPS.XuatPhanSo();

        PhanSo nhanPS = ps1.NhanMotPhanSoKhac(new PhanSo(1, 2));
        nhanPS.XuatPhanSo();

        PhanSo chiaPS = ps1.ChiaMotPhanSoKhac(new PhanSo(1, 2));
        chiaPS.XuatPhanSo();

        System.out.println("Ket thuc chuong trinh!");
    }
}
