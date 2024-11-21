package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Tuan7_Bai2 {
	 private String MSV; 
	    private String ten;
	    private String Ngsinh;
	    private double DTB;

	    public String getMSV() {
	        return MSV;
	    }

	    public void setMSV(String MSV) {
	        this.MSV = MSV;
	    }

	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public String getNgsinh() {
	        return Ngsinh;
	    }

	    public void setNgsinh(String Ngsinh) {
	        this.Ngsinh = Ngsinh;
	    }

	    public double getDTB() {
	        return DTB;
	    }

	    public void setDTB(double DTB) {
	        this.DTB = DTB;
	    }

	    public Tuan7_Bai2() {}

	    public void Nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap ma sinh vien: ");
	        this.MSV = sc.nextLine();
	        System.out.print("Nhap ho ten sinh vien: ");
	        this.ten = sc.nextLine(); 
	        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
	        this.Ngsinh = sc.nextLine();
	        System.out.print("Nhap diem trung binh: ");
	        this.DTB = sc.nextDouble(); 
	        sc.nextLine(); 
	    }

	    public void Xuat() {
	        System.out.println("Ma sinh vien" + this.MSV);
	        System.out.println("Ho ten sinh vien: " + this.ten);
	        System.out.println("Ngay sinh: " + this.Ngsinh);
	        System.out.println("Diem trung binh: " + this.DTB);
	    }

	    public static void main(String[] args) {
	        ArrayList<Tuan7_Bai2> danhSachSinhVien = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap so luong sinh vien: ");
	        int soLuong = scanner.nextInt();
	        scanner.nextLine(); 

	        for (int i = 0; i < soLuong; i++) {
	        	Tuan7_Bai2 sv = new Tuan7_Bai2();
	            System.out.println("Nhap sinh vien thu"+(i+1)+":");
	            sv.Nhap(); 
	            danhSachSinhVien.add(sv); 
	        }

	        System.out.println("\nDanh sach sinh vien:");
	        for (Tuan7_Bai2 sv : danhSachSinhVien) {
	            sv.Xuat(); 
	        }

	        
	        Collections.sort(danhSachSinhVien, new Comparator<Tuan7_Bai2>() {
	            @Override
	            public int compare(Tuan7_Bai2 sv1, Tuan7_Bai2 sv2) {
	                return Double.compare(sv2.getDTB(), sv1.getDTB());
	            }
	        });

	        System.out.println("\ndanh sach sinh vien sau khi sap xep giam dan DTB: ");
	        for (Tuan7_Bai2 sv : danhSachSinhVien) {
	            sv.Xuat();
	        }
	    }
}
