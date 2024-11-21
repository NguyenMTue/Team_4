package Bai3;
import java.util.Scanner;
public class Tuan6_Bai3 {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    public Tuan6_Bai3(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gui tien: " + soTien + ". So du hien tai: " + soDu + ".");
        } else {
            System.out.println("So tien gui phai lon hon 0.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rut tien thanh cong: " + soTien + ". So du hien tai: " + soDu + ".");
        } else {
            System.out.println("Khong the rut tien. Kiem tra so du hoac so tien rut.");
        }
    }

    public void kiemTraSoDu() {
        System.out.println("So du tai khoan " + soTaiKhoan + " cua " + chuTaiKhoan + " la: " + soDu + ".");
    }

    public static void main(String[] args) {
    	Tuan6_Bai3 taiKhoan = new Tuan6_Bai3("0585858876", "NVQ", 100);
        taiKhoan.kiemTraSoDu();
        taiKhoan.guiTien(50);
        taiKhoan.rutTien(30);
        taiKhoan.kiemTraSoDu();
    }
}
